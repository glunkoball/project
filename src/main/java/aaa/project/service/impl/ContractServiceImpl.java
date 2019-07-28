package aaa.project.service.impl;

import aaa.project.dao.ContractDao;
import aaa.project.entity.*;
import aaa.project.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContractServiceImpl implements ContractService {
@Autowired
    private ContractDao contractDao;

    /**
     * 根据编号查询要签订合同的房源信息
     * @param aptNum
     * @return
     */
    @Override
    public List<Apartment> findAptById(String aptNum) {
        return contractDao.findAptById(aptNum);
    }

    /**
     * 根据房东的身份证号查找房东的信息
     * @param id
     * @return
     */
    @Override
    public List<User> findFd(String id) {
        return contractDao.findFd(id);
    }

    /**
     * 将付款方式的数据加入到了apartment中
     * @param aptNum
     */
    @Override
    public void saveaddress(String aptNum,String address) {
        contractDao.saveaddress(aptNum,address);
    }

    /**
     * 将付款方式的数据加入到房东合同表
     * @param owerContract
     * @return
     */
    @Override
    public boolean addtocontract(OwerContract owerContract) {
        Double money = owerContract.getMoney();
        String pway = owerContract.getPway();
        Double needToPay=null;
        if(pway.equals("月付")){
             needToPay=money;
        }
        if(pway.equals("季付")){
             needToPay=money*3*0.03;
        }
        if(pway.equals("半年付")){
             needToPay=money*6*0.06;
        }
        if(pway.equals("年付")){
             needToPay=money*12*0.12;
        }
        if(contractDao.addtocontract(owerContract,needToPay)){
            return  true;
        }
        return false;
    }

    @Override
    public void savecontract(String aptNum, Integer pid,String  uid) {
        List<Apartment> aptById = contractDao.findAptById(aptNum);


        List<User> fd = contractDao.findFd(uid);
        Integer owerid = fd.get(0).getId();


        contractDao.savecontract(aptNum,owerid,pid);


    }

    @Override
    public List<OwerContract> findcontract(Integer pid) {
        return contractDao.findcontract(pid);
    }

    @Override
    public boolean addzkcontract(TenantContract tenantContract) {
        Double money = tenantContract.getMoney();
        String pway = tenantContract.getPway();
        Double need=null;
        if(pway.equals("月付")){
            need=money;
        }
        if(pway.equals("季付")){
            need=money*3;
        }
        if(pway.equals("半年付")){
            need=money*6;
        }
        if(pway.equals("年付")){
            need=money*12;
        }
        if(contractDao.addzkcontract(tenantContract,need)){
            return  true;
        }
        return false;
    }

    @Override
    public List<TenantContract> findzkcontract(Integer pid) {
        return contractDao.findzkcontract(pid);
    }

    @Override
    public void savezkcontract(String aptNum, Integer pid, String uid) {
        List<Apartment> aptById = contractDao.findAptById(aptNum);


        List<User> fd = contractDao.findFd(uid);
        Integer tenantid = fd.get(0).getId();


        contractDao.savezkcontract(aptNum,tenantid,pid);

    }

    @Override
    public void updateAptState(String aptNum) {
        contractDao.updateAptState(aptNum);
    }
    public void updateAptStatezk(String aptNum) {
        contractDao.updateAptState(aptNum);
    }
//根据房源编号查合同
    @Override
    public List<OwerContract> findcontractbyapt(String aptNum) {
        return contractDao.findcontractbyapt(aptNum);
    }

    @Override
    public void updateContractTime(String date1, String datenew,String aptNum) {
        contractDao.updateContractTime(date1,datenew,aptNum);
    }

    @Override
    public void addtotransaction(Tranction tranction) {

        contractDao.addtotransaction(tranction);
    }

    @Override
    public List<Tranction> findtransaction() {
        return contractDao.findtransaction();
    }

    @Override
    public void bindzandapt(String aptNum, Integer zid) {
        contractDao.bindzandapt(aptNum,zid);
    }
}
