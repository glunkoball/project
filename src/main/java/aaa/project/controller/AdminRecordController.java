package aaa.project.controller;

import aaa.project.entity.Apartment;
import aaa.project.service.AdminRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin/check")
public class AdminRecordController {
    @Autowired
    private AdminRecordService adminRecordService;
    //显示数据
    @RequestMapping("/recordlistAll")
    @ResponseBody
    public List<Apartment> recordlistAll(){
        List<Apartment> list = adminRecordService.recordlistAll();
        return list;
    }
    //钥匙借出
    @RequestMapping("/recordborrow")
    @ResponseBody
    public Integer recordborrow(@RequestBody String aptNum){
        System.out.println(aptNum);
        String newAptNum = aptNum.substring(0,aptNum.length()-1);
        Integer dm = adminRecordService.recordborrow(newAptNum);
        System.out.println(dm);
        return dm;
    }
    //钥匙借出
    @RequestMapping("/recordrepay")
    @ResponseBody
    public Integer recordrepay(@RequestBody String aptNum){
        System.out.println(aptNum);
        String newAptNum = aptNum.substring(0,aptNum.length()-1);
        Integer dm = adminRecordService.recordrepay(newAptNum);
        System.out.println(dm);
        return dm;
    }
    //添加钥匙信息
    @RequestMapping("/addrecord")
    @ResponseBody
    public Integer addrecord(@RequestBody Apartment apartment){
       System.out.println(apartment.getAptNum());
       System.out.println(apartment.getAddress());
       System.out.println(apartment.getAid());
       System.out.println(apartment.getContact());
       System.out.println(apartment.getKeystate());
       Integer add =  adminRecordService.addrecord(apartment);
       return add;
    }
}
