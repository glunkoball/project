package aaa.project.controller;

import aaa.project.common.PageModel;
import aaa.project.entity.OwerContract;
import aaa.project.service.QueryContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/contract")
public class QueryContractController {
    @Autowired
    private QueryContractService queryContractService;
    @RequestMapping("listContract")
    @ResponseBody
    public PageModel<OwerContract> listContract(String keyword,Integer currentPage,Integer pageSize ){
        PageModel<OwerContract> pm =queryContractService.listContract(keyword,currentPage,pageSize);
        return pm;
    }
}
