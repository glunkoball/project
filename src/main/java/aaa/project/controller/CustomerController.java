package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Admin;
import aaa.project.entity.Role;
import aaa.project.entity.User;
import aaa.project.service.CustomerService;
import aaa.project.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
* 客户页面控制器
* */
@RestController
@RequestMapping("/admin")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    /*
     * 查看所有客户信息
     * */
    @RequestMapping("user/listAllCustomer")
    @ResponseBody
    public List<User> listAllCustomer(String keyword){
        List<User> customer = customerService.listAllCustomer(keyword);
        System.out.println(customer);
        return customer;
    }
    /*
    * 保存或者修改客户信息
    * */
    @RequestMapping("user/saveOrAddCustomer")
    @ResponseBody
    public DefaultMsg saveOrUpdateCustomer(@RequestBody User user){
        DefaultMsg dm = new DefaultMsg();
        if (user.getId()!=null){
            DefaultMsg update = customerService.updateCustomer(user);
            dm=update;
        }else {
            DefaultMsg defaultMsg = customerService.addCustomer(user);
            dm=defaultMsg;
        }
        return dm;
    }
    /*
    * 删除客户
    * */
    @RequestMapping("user/deleteCustomer")
    @ResponseBody
    public DefaultMsg deleteCustomer( @RequestBody  User user) {
        DefaultMsg defaultMsg = customerService.deleteCustomer(user.getId());
        return defaultMsg;
    }
}
