package aaa.project.controller;

import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Params;
import aaa.project.service.AdminAuditService;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin/check")
public class AdminAuditController {
    @Autowired
    private AdminAuditService adminAuditService;
    @RequestMapping("/auditlistAll")
    @ResponseBody
    public List<Apartment> listAll(){
        List<Apartment> mess = adminAuditService.listAll();
        return mess;
    }
    @RequestMapping("/pass")
    @ResponseBody
    public Integer pass(@RequestBody String AptNum){
        String newAptNum = AptNum.substring(0,AptNum.length()-1);
        Integer pass = adminAuditService.pass(newAptNum);
        return pass;
    }
    @RequestMapping("/bindingbutton")
    @ResponseBody
    public List<Admin> bindingbutton(@RequestBody String AptNum){
        String newAptNum = AptNum.substring(0,AptNum.length()-1);
        List<Admin> All = adminAuditService.bindingbutton(AptNum);

        return All;
    }
    @RequestMapping("/binding")
    @ResponseBody
    public Integer binding(Params params){
        System.out.println(params);
        System.out.println(params.getAptNum());
        System.out.println(params.getId());
        String aptNum = params.getAptNum();
        Integer id = params.getId();
        System.out.println(aptNum);
        System.out.println(id);
        Integer binding = adminAuditService.binding(params);
        return binding;
    }
}