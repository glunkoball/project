package aaa.project.dao;

import aaa.project.entity.Admin;
import aaa.project.entity.User;
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
    public List<Admin> listAllUser(@Param("currentPage")Integer currentPage, @Param("pagesize")Integer pagesize, @Param("keyword") String keyword);
    /**
     * 查询总条数
     * @param keyword
     * @return
     */
    public Integer count(@Param("keyword")String keyword);
}
