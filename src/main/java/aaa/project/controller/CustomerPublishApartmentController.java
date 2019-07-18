package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import aaa.project.service.CustomerPublishApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerPublishApartmentController {
    @Autowired
    private CustomerPublishApartmentService customerPublishApartmentService;

    @RequestMapping("/publishApt")
    @ResponseBody
    public DefaultMsg publishApt(@RequestBody Apartment apartment){
        DefaultMsg dm =customerPublishApartmentService.publishApt(apartment);
        return dm;
    }

}
