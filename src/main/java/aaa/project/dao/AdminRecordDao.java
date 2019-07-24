package aaa.project.dao;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminRecordDao {
    //显示数据
    public List<Apartment> recordlistAll();
    //借出钥匙
    public Integer recordborrow(String newAptNum);
    //归还钥匙
    public Integer recordrepay(String newAptNum);
    //添加新的钥匙信息
    public Integer addrecord(Apartment apartment);
}
