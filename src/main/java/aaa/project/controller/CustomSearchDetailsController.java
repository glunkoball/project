package aaa.project.controller;

import aaa.project.entity.Apartment;
import aaa.project.service.CustomSearchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    public String findHome(Model model){
        Apartment oneHome = customSearchDetailsService.findOneHome();
        System.out.println(oneHome);
        model.addAttribute("oneHome",oneHome);

        return "details";
    }

}
