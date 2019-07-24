package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.dao.CustomerDao;
import aaa.project.entity.User;
import aaa.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    /*
    * 查询客户
    * */
    @Override
    public List<User> listAllCustomer(String keyword) {
        return customerDao.listAllCustomer(keyword);
    }
    /*
    * 编辑客户
    * */
    @Override
    public DefaultMsg updateCustomer(User user) {
        DefaultMsg dm = new DefaultMsg();
        Integer integer = customerDao.updateCustomer(user);
        if (integer==0){
            dm.setSuccess(0);
            dm.setError("修改数据失败");
        }
        return dm;
    }
    /*
    * 提交客户
    * */
    @Override
    public DefaultMsg addCustomer(User user) {
        DefaultMsg dm = new DefaultMsg();
        Integer integer = customerDao.addCustomer(user);
        if (integer==0){
            dm.setSuccess(0);
            dm.setError("提交数据失败");
        }
        return dm;
    }

    @Override
    public DefaultMsg deleteCustomer(Integer id) {
        DefaultMsg dm = new DefaultMsg();
        Integer integer = customerDao.deleteCustomer(id);
        if (integer==0){
            dm.setSuccess(0);
            dm.setError("删除数据失败");
        }
        return dm;
    }
}
