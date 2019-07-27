package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
import aaa.project.entity.OwerContract;
import aaa.project.service.CustomSearchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 客户查询房源详情页面
 * fhl
 */
@Controller

public class CustomSearchDetailsController {
    @Autowired
    private CustomSearchDetailsService customSearchDetailsService;


    /**
     * 查找详细的房源信息
     * @param model
     * @return
     */
    @RequestMapping("/details")
    public String findHome(Model model,String aptNum ){
        Apartment oneHome = customSearchDetailsService.findOneHome(aptNum);
        System.out.println(oneHome);
        model.addAttribute("oneHome",oneHome);
        return "details";
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public DefaultMsg saveOrUpdate(@RequestBody InterestedCustom custom){

        DefaultMsg de = customSearchDetailsService.save(custom);
        return de;

    }
    @RequestMapping("listOwercontract")
    @ResponseBody
    public PageModel<OwerContract> listOwercontract(String aptNum){
        PageModel<OwerContract> pm =customSearchDetailsService.listOwercontract(aptNum);
        return pm;
    }

}
