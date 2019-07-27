package aaa.project.dao;

import aaa.project.entity.OwerContract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminPayToFdDao {
    public List<OwerContract> findowercontract(@Param("keyword") String keyword);
}
