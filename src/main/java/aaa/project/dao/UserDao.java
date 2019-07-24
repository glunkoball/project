package aaa.project.dao;

import aaa.project.entity.Admin;
import aaa.project.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    /**
     * 查询每页的数据
     * @return
     */
    public List<Admin> listAllUser(@Param("keyword") String keyword);
    /**
     * 查询总条数
     * @param keyword
     * @return
     */
    public Integer count(@Param("keyword")String keyword);
    /*
    * 查看角色
    * */
    List<Role> listAllRoles();
    /*
    * 新增用户
    * */

    Integer saveOrUpdate(Admin admin);
    /*
    * 删除用户
    * */

    Integer delete(Integer id);
    /*
    * 更新用户信息
    * */

    Integer update(Admin admin);
}
