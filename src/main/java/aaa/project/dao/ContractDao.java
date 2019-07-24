package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ContractDao {
    public List<Apartment> findAptById(String aptNum);
    public List<User> findFd(String id);
    public void saveaddress(@Param("aptNum") String aptNum,@Param("address") String address);
    public boolean addtocontract(OwerContract owerContract);
    public void savecontract(@Param("aptNum")String  aptNum,@Param("owerid") Integer owerid,@Param("pid")Integer pid);
    public List<OwerContract> findcontract(Integer pid);
}
