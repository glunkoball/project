package aaa.project.dao;

import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CheckApartmentDao {

    Integer countCapt(Integer id);

    List<Capt> listCapt(@Param("start") Integer start, @Param("pageSize") Integer pageSize,@Param("id") Integer id);

    Integer deleteCapt(@Param("aptNum") String aptNum, @Param("customid") Integer customid);
}
