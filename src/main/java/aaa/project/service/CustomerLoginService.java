package aaa.project.service;

import aaa.project.entity.User;

public interface CustomerLoginService{

    /**
     * 查询用户是否存在
     * @param user
     * @return
     */
    public User checkUser(User user);
}
