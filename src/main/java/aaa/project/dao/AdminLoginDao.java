package aaa.project.dao;

import aaa.project.entity.Admin;
import aaa.project.entity.Module;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminLoginDao {
    /**
     * 根据用户名的密码查询用户对象
     * @param admin
     * @return
     */
    public Admin findUserAndPassword(Admin admin);
    /**
     * 查询用户能操作的一级菜单
     * @param user
     * @return
     */
    public List<Module> listOneModules(Admin user);
    /**
     * 查询用户能操作的一级菜单
     * @param user
     * @return
     */
    public List<Module> listTwoModules(@Param("user") Admin user, @Param("parent") Module parent);
    public  Admin findByUsername(String username);

}
