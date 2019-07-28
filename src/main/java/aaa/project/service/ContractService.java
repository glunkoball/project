package aaa.project.service;

import aaa.project.entity.*;

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
    public List<OwerContract> findcontractbyapt(String aptNum);
    public void  updateContractTime(String date1,String datenew,String aptNum);

    //插入数据到交易记录表中
    public void addtotransaction(Tranction tranction);

    public List<Tranction>  findtransaction();
   //绑定zukeid到房源中去
    public void bindzandapt(String aptNum,Integer zid);
}
