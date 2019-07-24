package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Mapper
public interface CustomerPersonalDao {

    public List<Apartment> showAllMyApt(@RequestBody Integer Id);

    public List<OwerContract> showJiaContract(@RequestBody Integer ownerId);

}
