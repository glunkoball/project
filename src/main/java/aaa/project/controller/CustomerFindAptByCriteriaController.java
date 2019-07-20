package aaa.project.controller;

import aaa.project.entity.Apartment;
import aaa.project.entity.City;
import aaa.project.service.CityService;
import aaa.project.service.CustomerFindAptByCriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerFindAptByCriteriaController {

    @Autowired
    private CustomerFindAptByCriteriaService customerFindAptByCriteriaService;


    @ResponseBody
    @RequestMapping("/findAptByCriteria")
    public List<Apartment> findAptByCriteria(@RequestBody Apartment apartment){
        List<Apartment> apartmentList = customerFindAptByCriteriaService.CustomerFindAptByCriteria(apartment);
        System.out.println(apartment);
        return apartmentList;
    }
    /*@RequestMapping("listCity")
    @ResponseBody
    public List<City> listCity(){
      List<City> cityList = cityService.listCity();
      return cityList;
    }*/
}
