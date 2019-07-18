package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.entity.Admin;
import aaa.project.entity.Module;
import aaa.project.service.AdminLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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
   @RequestMapping("/toError")
   public String error(){
       return "admin/error";
   }
    @RequestMapping("/aback")
    public String aback(){
        return "redirect:/admin/login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "admin/welcome";
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
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upt = new UsernamePasswordToken(admin.getUsername(), admin.getPassword());
        DefaultMsg dm=new DefaultMsg();
        try{
            subject.login(upt);
        }
        catch (AuthenticationException e){
            e.printStackTrace();
            dm.setSuccess(0);
            dm.setError("用户名或者密码错误");
        }
        /* Admin admins = adminLoginService.findUserAndPassword(admin);
        DefaultMsg dm = new DefaultMsg();
        //认证失败
        if(admins==null){
            dm.setSuccess(0);
            dm.setError("用户名或者密码输入错误");
        }else{
            session.setAttribute(Constants.SESSION_USER,admins);
        }*/
        return dm;
    }
    /**
     * 查询用户能操作的菜单
     * @return
     */
    @RequestMapping("/getUserMenus")
    @ResponseBody
    public List<Module> getUserMenus(HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        Admin principal =(Admin) subject.getPrincipal();
        //Admin user = (Admin) session.getAttribute(Constants.SESSION_USER);
        List<Module> modules = adminLoginService.queryUserMenus(principal);
        return modules;
    }
}
