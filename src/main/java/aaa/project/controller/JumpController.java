package aaa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/search")
    public String toSearch(){
        return "overview";
    }


    @RequestMapping("/signin")
    public String toSignin(){
        return "signin";
    }

    @RequestMapping("/details")
    public String toDetails(){
        return "details";
    }
}
