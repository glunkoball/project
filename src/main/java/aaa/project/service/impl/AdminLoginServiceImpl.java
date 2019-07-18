package aaa.project.service.impl;

import aaa.project.dao.AdminLoginDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Module;
import aaa.project.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    /**
     * 查询用户能操作的命名空间
     * @return
     */
    @Override
    public List<String> queryPermitByShiro(Admin user) {
        //查询用户能操作的菜单
        List<Module> modules = this.queryUserMenus(user);
        List<String> result=new ArrayList<String >();
        for(Module oneModule:modules){
            List<Module> children = oneModule.getChildren();
            for(Module twoModule:children){
                String path=twoModule.getUrl();
                String namespace = path.substring(0, path.lastIndexOf("/"));
                result.add(namespace);
            }
        }
        return result;
    }

    @Override
    public Admin findByUsername(String username) {
        return adminLoginDao.findByUsername(username);
    }
}
