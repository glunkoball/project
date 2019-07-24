package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;
import aaa.project.service.CheckApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * peng jiabin
 * 看房管理
 */
@Controller
@RequestMapping("admin/rent")
public class CheckApartmentController {
    @Autowired
    private CheckApartmentService checkApartmentService;

    /**
     * 查出看房日志
     * @param currentPage
     * @return
     */
    @RequestMapping("listCapt")
    @ResponseBody
    public PageModel<Capt> listCapt(Integer currentPage){
        PageModel<Capt> pageModel = checkApartmentService.listCapt(currentPage, Constants.DEFAULT_PAGE_SIZE);
        return pageModel;
    }

    /**
     * 删除记录
     * @param aptNum
     * @param customid
     * @return
     */
    @RequestMapping("deleteCapt")
    @ResponseBody
    public DefaultMsg deleteCapt(String aptNum,Integer customid){
        DefaultMsg dm =checkApartmentService.deleteCapt(aptNum,customid);
        return dm;
    }
}
