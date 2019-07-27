package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerPublishApartmentDao {
    Integer publishApt1(Apartment apartment);

    Integer publishApt2(Apartment apartment);

    Integer publishApt3(Apartment apartment);

    Integer publishApt4(@Param("apartment") Apartment apartment,@Param("imgUrl")String imgUrl);
}
