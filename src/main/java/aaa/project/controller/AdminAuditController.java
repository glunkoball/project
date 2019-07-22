package aaa.project.controller;

import aaa.project.entity.Apartment;
import aaa.project.service.AdminAuditService;
import org.apache.tomcat.util.buf.StringUtils;
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
    @RequestMapping("/query")
    @ResponseBody
    public List<Apartment> query(@RequestBody String AptNum){
        System.out.println(AptNum);
        String newAptNum = AptNum.substring(0,AptNum.length()-1);
        System.out.println(newAptNum);
        List<Apartment> query = adminAuditService.findById(newAptNum);
        System.out.println(query.get(0).getSofa());
        return query;
    }
}