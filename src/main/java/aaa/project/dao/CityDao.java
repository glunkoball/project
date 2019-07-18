package aaa.project.dao;

import aaa.project.entity.City;
import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityDao {
    List<City> listCity();


}
