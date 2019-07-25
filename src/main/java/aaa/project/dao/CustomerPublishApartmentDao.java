package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface CustomerPublishApartmentDao {
    Integer publishApt1(Apartment apartment);

    Integer publishApt2(Apartment apartment);

    Integer publishApt3(Apartment apartment);

    Integer publishApt4(Apartment apartment);
}
