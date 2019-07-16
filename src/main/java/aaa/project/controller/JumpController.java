package aaa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    /**
     * 跳转至主界面
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    /**
     * 跳转至查询房源界面
     * @return
     */
    @RequestMapping("/search")
    public String toSearch(){
        return "searchApt/overview";
    }

    /**
     * 跳转至注册界面
     * @return
     */
    @RequestMapping("/signin")
    public String toSignin(){
        return "signin";
    }

    @RequestMapping("/details")
    public String toDetails(){
        return "searchApt/details";
    }

    @RequestMapping("/post")
    public String toPost(){
        return "postApt/postApt";
    }

}
