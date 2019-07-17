package aaa.project.service.impl;

import aaa.project.dao.CustomerLoginDao;
import aaa.project.entity.User;
import aaa.project.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户登陆客户端的service实现类
 */
@Service
@Transactional
public class CustomerLoginServiceImpl implements CustomerLoginService {


    @Autowired
    private CustomerLoginDao customerLoginDao;


    /**
     * 根据输入的username和password判断用户是否存在
     * @param user
     * @return
     */
    @Override
    public User checkUser(User user) {
        return customerLoginDao.checkUser(user);
    }
}
