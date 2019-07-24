package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Custominfo;
import aaa.project.service.InterestedManagementService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * peng jia bin
 */
@Controller
@RequestMapping("admin/rent")
public class InterestedManagementController {
    @Autowired
    private InterestedManagementService interestedManagementService;

    /**
     * 查出房源信息加房东信息 分页
     * @param currentPage
     * @return
     */
    @RequestMapping("listInterestedManagement")
    @ResponseBody
    public PageModel<Apartment> listInterestedManagement(Integer currentPage ){
        PageModel<Apartment> pm =interestedManagementService.listInterestedManagement(currentPage, Constants.DEFAULT_PAGE_SIZE);
        return pm;
    }

    /**
     * 查出 有意看房者的信息
     * @param currentPage
     * @return
     */
    @RequestMapping("listCustominfo")
    @ResponseBody
    public PageModel<Custominfo> listCustominfo(String  aptNum ){
        PageModel<Custominfo> pm2 =interestedManagementService.listCustominfo(aptNum);
        return pm2;
    }

    /**
     * 添加预约时间
     * @param custTime
     * @return
     */
    @RequestMapping("addCustTime")
    @ResponseBody
    public DefaultMsg addCustTime(String custTime,Integer customid,String aptNum){
        DefaultMsg dm =interestedManagementService.addCustTime(custTime,customid,aptNum);
        return dm;
    }
    /**
     * 删除有意看房者
     */
    @RequestMapping("deleteCust")
    @ResponseBody
    public DefaultMsg deleteCust(Integer customid,String aptNum){
        DefaultMsg dm =interestedManagementService.deleteCust(customid,aptNum);
        return dm;
    }
}
