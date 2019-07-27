package aaa.project.dao;

import aaa.project.entity.OwerContract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QueryContractDao {
    List<OwerContract> listContract(@Param("keyword") String keyword,@Param("start") Integer start,@Param("pageSize") Integer pageSize);

    Integer countContract(@Param("keyword") String keyword);
}
