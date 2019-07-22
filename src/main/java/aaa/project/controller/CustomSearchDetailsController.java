package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
import aaa.project.service.CustomSearchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    public String findHome(Model model, String aptNum, HttpSession session){
        Apartment oneHome = customSearchDetailsService.findOneHome(aptNum);
        System.out.println(oneHome);
        model.addAttribute("oneHome",oneHome);
        session.setAttribute("home",oneHome);
        return "details";
    }
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public DefaultMsg saveOrUpdate(@RequestBody InterestedCustom custom,HttpSession session){
        Apartment home =(Apartment) session.getAttribute("home");
        String aptNum = home.getAptNum();
        DefaultMsg de = customSearchDetailsService.save(custom,aptNum);

        return de;

    }

}
