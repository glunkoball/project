package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.Role;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<Admin> listAllUser(String keyword);

    List<Role> listAllRoles();


    DefaultMsg saveOrUpdate(Admin admin);

    DefaultMsg delete(Integer id);

    DefaultMsg update(Admin admin);
}
