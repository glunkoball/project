package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Custominfo;
import aaa.project.service.CheckApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckApartmentController {
    @Autowired
    private CheckApartmentService checkApartmentService;
    @RequestMapping("admin/listCustomInfo")
    @ResponseBody
    public PageModel<Custominfo> listCustomInfo( Integer currentPage){
        PageModel<Custominfo> pageModel = checkApartmentService.listCustomInfo(currentPage, Constants.DEFAULT_PAGE_SIZE);
        return pageModel;
    }
}
