package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerFindAptByCriteriaDao {
    public List<Apartment> CustomerFindAptByCriteria(@Param("district") String district,@Param("rentMethodsForSearch") String rentMethodsForSearch, @Param("price")Double price,@Param("bedrooms") Integer bedrooms,@Param("facing") String facing);
}
