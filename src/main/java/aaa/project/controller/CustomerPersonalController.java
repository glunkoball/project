package aaa.project.controller;

import aaa.project.common.Constants;
import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.entity.User;
import aaa.project.service.CustomerPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CustomerPersonalController {

    @Autowired
    private CustomerPersonalService customerPersonalService;

    /**
     * 根据用户user登陆时存的session查询出登陆用户的user id
     * 根据user id查询该用户的房源(房东+租客)
     * @param session
     * @return
     */
    @RequestMapping("/showAllMyApt")
    @ResponseBody
    public List<Apartment> toShowMyApr(HttpSession session){
        User user =(User) session.getAttribute(Constants.SESSION_USER);
        List<Apartment> allMyApt = customerPersonalService.findAllMyApt(user.getId());
        return allMyApt;
    }

    /**
     * 显示甲方合同
     * @param session
     * @return
     */
    @RequestMapping("/JiaContract")
    @ResponseBody
    public List<OwerContract> showJiaContract(HttpSession session){
        User user =(User) session.getAttribute(Constants.SESSION_USER);
        List<OwerContract> JiaContract = customerPersonalService.ShowJiaContract(user.getId());
        return JiaContract;
    }

    /**
     * 显示乙方合同
     * @param session
     * @return
     */
    @RequestMapping("/YiContract")
    @ResponseBody
    public List<TenantContract> showYiContract(HttpSession session){
        User user =(User) session.getAttribute(Constants.SESSION_USER);
        List<TenantContract> YiContract = customerPersonalService.ShowYiContract(user.getId());
        return YiContract;
    }

}