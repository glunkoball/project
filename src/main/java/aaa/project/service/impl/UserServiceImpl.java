package aaa.project.service.impl;

import aaa.project.common.PageModel;
import aaa.project.dao.UserDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Role;
import aaa.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /*
     * 查看所有用户信息
     * */
    @Override
    public PageModel<Admin> listAllUser(Integer currentPage, Integer pagesize, String keyword) {
        PageModel<Admin> pm = new PageModel<Admin>();
        //查询总条数
        pm.setTotal(userDao.count(keyword));
        //查询每页的数据
        List<Admin> admins = userDao.listAllUser(currentPage, pagesize, keyword);
        for(Admin a : admins){
            List<Role> roles = a.getRoles();
            if(roles.size()==0){
                continue;
            }
            String roleStrs = "";
            for(Role r : roles){
                roleStrs+=r.getRolename()+",";
            }
            roleStrs=roleStrs.substring(0,roleStrs.length()-1);
            a.setRoleStrs(roleStrs);
        }
        pm.setRows(admins);
        return pm;
    }
}
