package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.User;
import aaa.project.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class SigninController {
    @Autowired
    private SigninService signinService;
    @RequestMapping("signinUser")
    @ResponseBody
    public DefaultMsg signinUser(@RequestBody User user){
        DefaultMsg dm =signinService.signinUser(user);
        return dm;
    }
}