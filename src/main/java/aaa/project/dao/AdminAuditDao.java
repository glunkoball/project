package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminAuditDao {
    /**
     * 查询所有信息
     * @param
     * @return
     */
    public List<Apartment> listAll();
    public List<Apartment> findById(String newAptNum);

}