package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InterestedManagementDao {
    List<Apartment> listInterestedManagement(@Param("start") Integer start,@Param("pageSize") Integer pageSize, @Param("id") Integer id);

    Integer countInterestedManagement(Integer id);
}
