package aaa.project.dao;

import aaa.project.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminLoginDao {
    /**
     * 根据用户名的密码查询用户对象
     * @param admin
     * @return
     */
    public Admin findUserAndPassword(Admin admin);
}
