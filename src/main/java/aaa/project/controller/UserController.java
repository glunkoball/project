package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.Role;
import aaa.project.entity.User;
import aaa.project.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;
    /*
     * 查看所有用户信息
     * */
    @RequestMapping("user/listAllUser")
    public List<Admin> listAllUser(String keyword){
        List<Admin> admins = userService.listAllUser(keyword);
        return admins;
    }
    /*
    *
    * 下拉框角色
    * */
    @RequestMapping("user/listAllRoles")
    public List<Role> listAllRoles(){
        List<Role> roles = userService.listAllRoles();
        return roles;
    }
    /*
    * 增加管理员
    * */
    @RequestMapping("user/saveOrUpdate")
    public DefaultMsg saveOrUpdate(@RequestBody Admin admin){
        DefaultMsg dm = new DefaultMsg();
        if (admin.getId()!=null){
            DefaultMsg update = userService.update(admin);
            dm=update;
        }else {
            DefaultMsg defaultMsg = userService.saveOrUpdate(admin);
            dm=defaultMsg;
        }
        return dm;
    }
    //删除管理员
    @RequestMapping("user/delete")
    public DefaultMsg delete(@RequestBody Admin admin){
        DefaultMsg defaultMsg = userService.delete(admin.getId());
        return defaultMsg;
    }
}
