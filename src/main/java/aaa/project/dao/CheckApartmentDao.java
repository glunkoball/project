package aaa.project.dao;

import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CheckApartmentDao {

    Integer countCapt(Integer id);

    List<Capt> listCapt(Integer start, Integer pageSize, Integer id);

    Integer deleteCapt(String aptNum, Integer customid);
}
