package aaa.project.controller;

import aaa.project.entity.OwerContract;
import aaa.project.service.AdminPayToFdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminPayToFdController {
    @Autowired
    private AdminPayToFdService adminPayToFdService;

    @RequestMapping("finance/payRent")
    public String payRent(){
        return "admin/payfd/needtopay";
    }

    /**
     * 查看需要给房东支付的账单
     * @return
     */
    @RequestMapping("finance/findowercontract")
    @ResponseBody
    public List<OwerContract> findowercontract(String keyword){
        System.out.println("aaaaaa"+keyword);
        List<OwerContract> findowercontract = adminPayToFdService.findowercontract(keyword);

        return  findowercontract;
    }
}
