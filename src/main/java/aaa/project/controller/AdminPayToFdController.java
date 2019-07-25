package aaa.project.controller;

import aaa.project.entity.OwerContract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminPayToFdController {
    @RequestMapping("finance/payRent")
    public String payRent(){
        return "admin/payfd/needtopay";
    }

    @RequestMapping("finance/findowercontract")
    @ResponseBody
    public List<OwerContract> findowercontract(){

           return  null;
    }
}
