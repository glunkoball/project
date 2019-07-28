package aaa.project.dao;

import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Params;
import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminAuditDao {
    /**
     * 查询所有信息
     * @param
     * @return
     */
    public List<Apartment> listAll();
    public Integer pass(String newAptNum);
    public List<Admin> bindingbutton(String AptNum);
    public Integer binding(Params params);

    public List<Apartment> publishlistAll();

    public Integer updateState(String newAptNum);

    public boolean  updateprice(@Param("aptNum") String aptNum,@Param("price") Double price);


}