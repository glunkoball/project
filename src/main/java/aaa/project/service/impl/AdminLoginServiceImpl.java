package aaa.project.service.impl;

import aaa.project.dao.AdminLoginDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Module;
import aaa.project.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
    @Autowired
    private AdminLoginDao adminLoginDao;
    @Override
    public Admin findUserAndPassword(Admin admin) {
        return adminLoginDao.findUserAndPassword(admin);
    }

    @Override
    public List<Module> queryUserMenus(Admin user) {
        List<Module> oneModules = adminLoginDao.listOneModules(user);
        for(Module oneModule :oneModules){
            List<Module> twoModules =  adminLoginDao.listTwoModules(user,oneModule);
            oneModule.setChildren(twoModules);
        }

        return oneModules;
    }
}
