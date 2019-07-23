package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.service.InterestedManagementService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/rent")
public class InterestedManagementController {
    @Autowired
    private InterestedManagementService interestedManagementService;
    @RequestMapping("listInterestedManagement")
    public PageModel<Apartment> listInterestedManagement(Integer currentPage ){
        PageModel<Apartment> pm =interestedManagementService.listInterestedManagement(currentPage, Constants.DEFAULT_PAGE_SIZE);
        return pm;
    }

}
