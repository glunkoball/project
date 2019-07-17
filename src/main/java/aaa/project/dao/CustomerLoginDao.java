package aaa.project.dao;

import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerLoginDao {
    /**
     * 根据输入的用户名和密码查询用户是否存在
     * @param user
     * @return
     */
    public User checkUser(User user);

}
