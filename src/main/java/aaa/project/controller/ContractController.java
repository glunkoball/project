package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.User;
import aaa.project.po.FdForm;
import aaa.project.po.RuleForm;
import aaa.project.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ContractController {
    @Autowired
    private ContractService contractService;
    @RequestMapping("contract/createContractA")
    public String createContractA(){
        return "admin/contract/fdcontract";
    }

    /**
     * 根据编号查找房源信息
     * @param
     * @return
     */
    @RequestMapping("contract/findAptById")
    @ResponseBody
    public List<Apartment> findAptById(@RequestBody Apartment apartment){
        String aptNum = apartment.getAptNum();
        System.out.println(aptNum);
        String address = apartment.getAddress();
        contractService.saveaddress(aptNum,address);
        List<Apartment> aptById = contractService.findAptById(aptNum);
        System.out.println(aptById);
        return aptById;
    }

    /**
     * 根据身份证查询房东的信息
     * @param user
     * @return
     */
    @RequestMapping("contract/findFd")
    @ResponseBody
    public List<User> findFd(@RequestBody User user){
        String id = user.getIdentification();

        List<User> fd = contractService.findFd(id);

        return fd;
    }
    @RequestMapping("contract/addtocontract")
    @ResponseBody
    public DefaultMsg addtocontract(@RequestBody OwerContract owerContract){
        DefaultMsg dm = new DefaultMsg();
        if(contractService.addtocontract(owerContract)){

        }
       else{
          dm.setSuccess(0);
          dm.setError("失败");
       }
        return dm;
    }

    /**
     * 生成合同,uid是身份证
     * @param aptNum
     * @return
     */
    @RequestMapping("contract/makeContract")
    public String makeContract(String aptNum,Integer pid,String  uid,Model model){
        System.out.println(aptNum);
        System.out.println(pid);
        contractService.savecontract(aptNum,pid,uid);
        List<User> fd = contractService.findFd(uid);
        model.addAttribute("fd",fd);
        List<Apartment> apt = contractService.findAptById(aptNum);
        model.addAttribute("apt",apt);
        List<OwerContract> pay = contractService.findcontract(pid);
        model.addAttribute("pay",pay);

        return "admin/contract/makecontract";
    }

}
