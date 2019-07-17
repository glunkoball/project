package aaa.project.dao;

import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SigninDao {
    Integer countUserName(User user);

    Integer signinUser(User user);
}
