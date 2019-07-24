package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
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
    public List<Admin> listAllUser(String keyword) {
        return userDao.listAllUser(keyword);
    }
    /*
     * 查看所有角色
     * */
    @Override
    public List<Role> listAllRoles() {
        return userDao.listAllRoles();
    }
    /*
    * 新增用户
    * */
    @Override
    public DefaultMsg saveOrUpdate(Admin admin) {
        DefaultMsg dm = new DefaultMsg();
        Integer integer = userDao.saveOrUpdate(admin);
        if (integer==0){
            dm.setSuccess(0);
            dm.setError("提交数据失败");
        }
        return dm;
    }

    @Override
    public DefaultMsg delete(Integer id) {
        DefaultMsg dm = new DefaultMsg();
        Integer delete = userDao.delete(id);
        if (delete==0){
            dm.setSuccess(0);
            dm.setError("删除用户失败");
        }
        return dm;
    }

    @Override
    public DefaultMsg update(Admin admin) {
        DefaultMsg dm = new DefaultMsg();
        Integer integer = userDao.update(admin);
        if (integer==0){
            dm.setSuccess(0);
            dm.setError("修改数据失败");
        }
        return dm;
    }


}
