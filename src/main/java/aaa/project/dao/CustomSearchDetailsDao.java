package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomSearchDetailsDao {
    /**
     * 显示房源的详细信息
     * @return
     */
    public Apartment findOneHome(@Param("aptNum") String aptNum);
    public Integer save(InterestedCustom custom);
    public Integer findCustomId();
    public  void BindCusAndApt(@Param("aptNum") String aptNum,@Param("customid") Integer customid);


}
