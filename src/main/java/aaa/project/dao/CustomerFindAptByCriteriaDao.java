package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerFindAptByCriteriaDao {
    public List<Apartment> CustomerFindAptByCriteria(String district, String rentMethodsForSearch, Double price, Integer bedrooms, String facing);
}
