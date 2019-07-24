package aaa.project.dao;

import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    /*
    * 更新用户
    * */
   Integer updateCustomer(User user);

    /*
    * 查询客户
    * */
    List<User> listAllCustomer(@Param("keyword") String keyword);
    /*
    * 添加用户
    * */
    Integer addCustomer(User user);
    /*
    * 删除用户
    * */
    Integer deleteCustomer(@Param("id") Integer id);
}
