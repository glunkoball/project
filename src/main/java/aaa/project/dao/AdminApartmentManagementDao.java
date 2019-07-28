package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminApartmentManagementDao {
    public List<Apartment> findAllApt();

    public List<Apartment> findAvailableApt(Apartment apartment);
    public List<Apartment> findMyApt(Integer id);

}
