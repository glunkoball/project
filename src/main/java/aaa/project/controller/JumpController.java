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
        return "searchApt/searchApt";
    }

    /**
     * 跳转至注册界面
     * @return
     */
    @RequestMapping("/signin")
    public String toSignin(){
        return "signin";
    }


    @RequestMapping("/map")
    public String tomap(){
        return "map";
    }

    @RequestMapping("/post")
    public String toPost(){
        return "postApt/postApt";
    }



}
