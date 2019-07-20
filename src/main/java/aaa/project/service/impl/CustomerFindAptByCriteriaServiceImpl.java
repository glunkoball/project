package aaa.project.service.impl;

import aaa.project.dao.CustomerFindAptByCriteriaDao;
import aaa.project.entity.Apartment;
import aaa.project.service.CustomerFindAptByCriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerFindAptByCriteriaServiceImpl implements CustomerFindAptByCriteriaService {

    @Autowired
    private CustomerFindAptByCriteriaDao customerFindAptByCriteriaDao;

    @Override
    public List<Apartment> CustomerFindAptByCriteria(Apartment apartment) {
        String district = apartment.getDistrict();
        String rentMethodsForSearch = apartment.getRentMethodsForSearch();
        Double price = apartment.getPrice();
        Integer bedrooms = apartment.getBedrooms();
        String facing = apartment.getFacing();
        List<Apartment> list = customerFindAptByCriteriaDao.CustomerFindAptByCriteria(district, rentMethodsForSearch, price, bedrooms, facing);
        return list;
    }
}
