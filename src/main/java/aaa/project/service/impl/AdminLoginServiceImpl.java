package aaa.project.service.impl;

import aaa.project.dao.AdminLoginDao;
import aaa.project.entity.Admin;
import aaa.project.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
    @Autowired
    private AdminLoginDao adminLoginDao;
    @Override
    public Admin findUserAndPassword(Admin admin) {
        return adminLoginDao.findUserAndPassword(admin);
    }
}
