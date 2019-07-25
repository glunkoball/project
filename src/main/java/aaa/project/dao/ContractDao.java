package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
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
    public boolean addtocontract(@Param("t")OwerContract owerContract,@Param("needToPay") Double needToPay);
    public void savecontract(@Param("aptNum")String  aptNum,@Param("owerid") Integer owerid,@Param("pid")Integer pid);
    public List<OwerContract> findcontract(Integer pid);
    public boolean addzkcontract(@Param("tc") TenantContract tenantContract,@Param("need") Double need);
    public List<TenantContract> findzkcontract(Integer pid);
    public void savezkcontract(@Param("aptNum")String  aptNum,@Param("tenantid") Integer tenantid,@Param("pid")Integer pid);
    public void updateAptState(String aptNum);
    public void updateAptStatezk(String aptNum);
}
