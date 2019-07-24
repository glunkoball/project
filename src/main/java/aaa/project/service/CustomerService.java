package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.User;

import java.util.List;

public interface CustomerService {
    public List<User> listAllCustomer(String keyword);

    DefaultMsg updateCustomer(User user);

    DefaultMsg addCustomer(User user);

    DefaultMsg deleteCustomer(Integer id);
}
