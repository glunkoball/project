package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.entity.User;
import aaa.project.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 客户登陆客户端网页的controller
 */
@Controller
public class CustomerLoginController {

    @Autowired
    private CustomerLoginService customerLoginService;

    /**
     * 用户输入username和password登陆
     * 查询数据库中有没有对应的数据
     * 如果有说明登陆成功，将姓名存在session域中
     * 如果没有说明登陆失败，返回Defalut message，并显示在当前登陆网页中
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkUser")
    public DefaultMsg login(@RequestBody User user, HttpSession session){
        DefaultMsg defaultMsg = new DefaultMsg();

        user = customerLoginService.checkUser(user);
        //账号或密码输入错误，认证失败
        if(user==null){
            defaultMsg.setSuccess(1);
            defaultMsg.setError("用户名或密码输入错误");
        }else{
            session.setAttribute(Constants.SESSION_USER,user);
        }
        return defaultMsg;
    }


}
