package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.User;
import aaa.project.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;
    /*
     * 查看所有用户信息
     * */
    @RequestMapping("user/listAllUser")
    public PageModel<Admin> listAllUser(String keyword,Integer currentPage){
        PageModel<Admin> adminPageModel = userService.listAllUser(currentPage, Constants.DEFAULT_PAGE_SIZE, keyword);
       return adminPageModel;
    }
}
