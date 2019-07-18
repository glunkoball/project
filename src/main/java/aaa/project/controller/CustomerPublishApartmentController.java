package aaa.project.controller;

import aaa.project.entity.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerPublishApartmentController {

    @RequestMapping("/publishApt")
    public String publishApt(@RequestBody Apartment apartment){
        System.out.println(apartment);
        return null;
    }

}
