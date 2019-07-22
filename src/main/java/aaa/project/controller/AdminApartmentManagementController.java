package aaa.project.controller;

import aaa.project.entity.Apartment;
import aaa.project.service.AdminApartmentManagementService;
import aaa.project.service.CustomerFindAptByCriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminApartmentManagementController {

    @Autowired
    private AdminApartmentManagementService adminApartmentManagementService;

    @RequestMapping("rent/findAllApt")
    @ResponseBody
    public List<Apartment> findAllApt(){
        List<Apartment> aptList = adminApartmentManagementService.findAllApt();
        return aptList;
    }

    @RequestMapping("/rent/findAptByCriteria")
    @ResponseBody
    public List<Apartment> findAvailableAptBySearch(@RequestBody Apartment apartment){
        return adminApartmentManagementService.findAvailableApt(apartment);
    }

    @RequestMapping("rent/findMyApt")
    @ResponseBody
    public List<Apartment> findMyApt(){
        List<Apartment> aptList = adminApartmentManagementService.findMyApt();
        return aptList;
    }
}
