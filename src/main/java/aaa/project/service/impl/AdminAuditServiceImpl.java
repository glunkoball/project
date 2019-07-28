package aaa.project.service.impl;

import aaa.project.dao.AdminAuditDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Params;
import aaa.project.entity.User;
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
    public Integer pass(String newAptNum) {
        return adminAuditDao.pass(newAptNum);
    }

    @Override
    public List<Admin> bindingbutton(String AptNum) {
        return adminAuditDao.bindingbutton(AptNum);
    }

    @Override
    public Integer binding(Params params) {
        return adminAuditDao.binding(params);
    }

    /**
     * 展示已经签完合同需要发布房源的房源信息
     * @return
     */
    @Override
    public List<Apartment> publishlistAll() {
        return adminAuditDao.publishlistAll();
    }

    @Override
    public Integer updateState(String newAptNum) {
        return adminAuditDao.updateState(newAptNum);
    }

    @Override
    public boolean updateprice(String aptNum, Double price) {
        if(adminAuditDao.updateprice(aptNum,price)){
            return true;
        }
        return false;
    }


}