package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.entity.Admin;
import aaa.project.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    @Autowired
    private AdminLoginService adminLoginService;
    /**
     *跳转后台登录界面
     * @return
     */
    @RequestMapping("/login")
    public String toadmainLogin(){
        return "admin/login";
    }

    /**
     * 跳转后台的主界面
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(){
        return "admin/index";
    }

    /**
     * 校验登录名和密码
     * @param admin
     * @param session
     * @return
     */
    @RequestMapping("/checkUser")
    @ResponseBody
    public DefaultMsg checkUser(@RequestBody Admin admin, HttpSession session){
        Admin admins = adminLoginService.findUserAndPassword(admin);
        DefaultMsg dm = new DefaultMsg();
        //认证失败
        if(admins==null){
            dm.setSuccess(0);
            dm.setError("用户名或者密码输入错误");
        }else{
            session.setAttribute(Constants.SESSION_USER,admins);
        }
        return dm;
    }
    /**
     * 查询用户能操作的菜单
     * @return
     */
    @RequestMapping("/getUserMenus")
    @ResponseBody
    public List<Module> getUserMenus(HttpSession session){
        Users  user = (Users)session.getAttribute(Constants.SESSION_USER);
        List<Module> modules = userService.queryUserMenus(user);
        return modules;
    }
}
