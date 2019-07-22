package aaa.project.service;

import aaa.project.entity.Apartment;

import java.util.List;

public interface AdminRecordService {
    //显示数据
    public List<Apartment> recordlistAll();
    //钥匙借出
    public Integer recordborrow(String newAptNum);
    //钥匙归还
    public Integer recordrepay(String newAptNum);
    //添加新的钥匙信息
    public Integer addrecord(Apartment apartment);
}
