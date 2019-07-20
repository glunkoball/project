package aaa.project.service.impl;

import aaa.project.dao.AdminApartmentManagementDao;
import aaa.project.entity.Apartment;
import aaa.project.service.AdminApartmentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminApartmentManagementServiceImpl implements AdminApartmentManagementService {

    @Autowired
    private AdminApartmentManagementDao adminApartmentManagementDao;

    @Override
    public List<Apartment> findAllApt() {
        return adminApartmentManagementDao.findAllApt();
    }
}
