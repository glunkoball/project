package aaa.project.controller;

import aaa.project.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
* 用户管理
* 只负责跳转
* */
@Controller
@RequestMapping("/admin")
public class JumpUserController {
    @RequestMapping("user/userControl")
    public String toUserPage(){
        return "admin/user/userControl";
    }
    @RequestMapping("user/customerControl")
    public String toCustomerPage(){
        return "admin/user/customerControl";
    }

}
