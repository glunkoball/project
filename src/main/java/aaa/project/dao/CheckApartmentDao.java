package aaa.project.dao;

import aaa.project.entity.Custominfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CheckApartmentDao {

    Integer countCustominfo(Integer currentPage, Integer defaultPageSize);

    List<Custominfo> listCustomInfo(Integer currentPage, Integer defaultPageSize);
}
