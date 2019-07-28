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
import org.springframework.ui.Model;
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
     *跳转有意看房管理
     * @return
     */
    @RequestMapping("rent/interestedManagement")
    public String toInter(){
        return "admin/apartmentManagement/interestedManagement";
    }
    /**
     *跳转后台登录界面
     * @return
     */
    @RequestMapping("/login")
    public String toadmainLogin(){
        return "admin/login";
    }

    /**
     * 跳转至租赁管理中的房源管理
     * @return
     */
    @RequestMapping("rent/apartmentSource")
    public String toApartmentManagement(){
        return "admin/apartmentManagement/ApartmentManagement";
    }



    @RequestMapping("rent/myApt")
    public String toMyApt(){
        return "admin/apartmentManagement/MyApt";
    }
    /**
     * 看房管理
     * @return
     */
    @RequestMapping("rent/checkApartment")
    public String toCheckApartment(){
        return "admin/apartmentManagement/CheckApartment";
    }

    /**
     * 房屋审核
     * @return
     */
    @RequestMapping("check/checkSubmission")
    public String toCheckSubmission(){
        return "admin/check/audit";
    }


   @RequestMapping("/toError")
   public String error(){
       return "admin/error";
   }
    @RequestMapping("/aback")
    public String aback(){
        return "redirect:/admin/login";
    }

    /**
     * 跳转至后台的Home主页面
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome(){
        return "admin/welcome";
    }
    /**
     * 跳转后台的管理主界面
     * @return
     */


    /**
     * 校验登录名和密码
     * @param admin
     * @param session
     * @return
     */
    //UsernamePasswordToken u=null;
    @RequestMapping("/checkUser")
    @ResponseBody
    public DefaultMsg checkUser(@RequestBody Admin admin, HttpSession session,Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upt = new UsernamePasswordToken(admin.getUsername(), admin.getPassword());
        DefaultMsg dm=new DefaultMsg();
        UsernamePasswordToken u = upt;
        System.out.println("dieci"+u);
       // session.setAttribute(Constants.SESSION_ADMIN,upt);
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

    @RequestMapping("/index")
    public String toIndex(Model model){
       // System.out.println("adas"+u);
       // model.addAttribute("uu",u.getUsername());
        Subject subject = SecurityUtils.getSubject();
        Admin principal =(Admin) subject.getPrincipal();
        model.addAttribute("uu",principal.getUsername());
        return "admin/index";
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
