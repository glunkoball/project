package aaa.project.service.impl;

import aaa.project.dao.AdminRecordDao;
import aaa.project.entity.Apartment;
import aaa.project.service.AdminRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class AdminRecordServiceImpl implements AdminRecordService {
    @Autowired
    private AdminRecordDao adminRecordDao;
    //显示数据
    @Override
    public List<Apartment> recordlistAll() {
        return adminRecordDao.recordlistAll();
    }
    //钥匙借出
    @Override
    public Integer recordborrow(String newAptNum) {
        return adminRecordDao.recordborrow(newAptNum);
    }
    //钥匙归还
    @Override
    public Integer recordrepay(String newAptNum) {
        return adminRecordDao.recordrepay(newAptNum);
    }
    //添加新的钥匙信息
    @Override
    public Integer addrecord(Apartment apartment) {
        return adminRecordDao.addrecord(apartment);
        //return adminRecordDao.addrecord(apartment);
    }
}
