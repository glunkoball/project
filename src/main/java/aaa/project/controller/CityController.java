package aaa.project.controller;

import aaa.project.entity.City;
import aaa.project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/to")
    public String toSelectHouse(){
        return "searchApt/selectHouse";
    }
    @RequestMapping("listCity")
    @ResponseBody
    public List<City> listCity(){
      List<City> cityList = cityService.listCity();
      return cityList;
    }
}
