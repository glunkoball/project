package aaa.project.dao;

import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomSearchDetailsDao {
    /**
     * 显示房源的详细信息
     * @return
     */
    public Apartment findOneHome();

}
