package aaa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * 跳转至个人中心界面
     * @return
     */
    @RequestMapping("/personal")
    public String toPersonal(){
        return "personal/personal";
    }
    /**
     * 地图插件
     * @return
     */
    @RequestMapping("/map")
    public String tomap(){
        return "map";
    }

    /**
     * 跳转至发布房源界面
     * @return
     */
    @RequestMapping("/post")
    public String toPost(){
        return "postApt/postApt";
    }



}
