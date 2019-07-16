package aaa.project.controller;

import aaa.project.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SigninController {

    @RequestMapping("signinUser")
    public String signinUser(@RequestBody User user){
        System.out.println(user);
        return null;
    }
}
