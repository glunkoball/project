package aaa.project.service.impl;

import aaa.project.dao.ContractDao;
import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.User;
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
     * 将详细地址 加入到了apartment中
     * @param aptNum
     */
    @Override
    public void saveaddress(String aptNum,String address) {
        contractDao.saveaddress(aptNum,address);
    }

    @Override
    public boolean addtocontract(OwerContract owerContract) {
        if(contractDao.addtocontract(owerContract)){
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
}
