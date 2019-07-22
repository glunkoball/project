package aaa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ContractController {
    @RequestMapping("contract/createContractA")
    public String createContractA(){
        return "admin/contract/fdcontract";
    }
}
