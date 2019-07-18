package aaa.project.service.impl;

import aaa.project.dao.CityDao;
import aaa.project.entity.City;
import aaa.project.entity.User;
import aaa.project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> listCity() {
        List<City> cityList = cityDao.listCity();
        System.out.println(cityList);

        return cityList;
    }
}
