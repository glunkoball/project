package aaa.project.service;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.entity.User;

import java.util.List;

public interface ContractService {
    public List<Apartment> findAptById(String aptNum);
    public List<User> findFd(String id);
    public void saveaddress(String aptNum,String address);
    public boolean addtocontract(OwerContract owerContract);
    public void savecontract(String aptNum,Integer pid,String  uid);
    public List<OwerContract> findcontract(Integer pid);
    public boolean addzkcontract(TenantContract tenantContract);
    public List<TenantContract> findzkcontract(Integer pid);
    public void savezkcontract(String aptNum,Integer pid,String  uid);
    public void updateAptState(String aptNum);
    public void updateAptStatezk(String aptNum);
}
