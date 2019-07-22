package aaa.project.service;

import aaa.project.common.PageModel;
import aaa.project.entity.Admin;
import aaa.project.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public PageModel<Admin> listAllUser(Integer currentPage, Integer pagesize, String keyword);

}
