package aaa.project.service.impl;

import aaa.project.dao.AdminAuditDao;
import aaa.project.entity.Apartment;
import aaa.project.service.AdminAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class AdminAuditServiceImpl implements AdminAuditService {
    @Autowired
    private AdminAuditDao adminAuditDao;
    @Override
    public List<Apartment> listAll() {
        return adminAuditDao.listAll();
    }


    @Override
    public List<Apartment> findById(String newAptNum) {
        return adminAuditDao.findById(newAptNum);
    }
}