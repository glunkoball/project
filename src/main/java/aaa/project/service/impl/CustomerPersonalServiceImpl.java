package aaa.project.service.impl;

import aaa.project.dao.CustomerPersonalDao;
import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.entity.TransactionRecord;
import aaa.project.service.CustomerPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Service
@Transactional
public class CustomerPersonalServiceImpl implements CustomerPersonalService {

    @Autowired
    private CustomerPersonalDao customerPersonalDao;

    @Override
    public List<Apartment> findAllMyApt(Integer Id) {
        List<Apartment> list = customerPersonalDao.showAllMyApt(Id);
        return list;
    }

    @Override
    public List<OwerContract> ShowJiaContract(Integer OwnerId) {
        return customerPersonalDao.showJiaContract(OwnerId);
    }

    @Override
    public List<TenantContract> ShowYiContract(Integer tenantId) {
        return customerPersonalDao.showYiContract(tenantId);
    }

    @Override
    public List<TenantContract> loadToPayList(Integer tenantId) {
        return customerPersonalDao.showYiContract(tenantId);
    }

    @Override
    public int setIntoRecord(TransactionRecord transactionRecord) {
        //在transactionrecord表中insert交易数据
        int i =customerPersonalDao.setIntoRecord(transactionRecord);
        String tradeOutNum = transactionRecord.getSubject();
        String aptNum = tradeOutNum.substring(0, 14);
        //根据支付实体类transactionRecord中的‘交易名称’字段(显示的是房源编号)，获取nextTime字段的值
        TenantContract tenantContract = customerPersonalDao.showNextTime(aptNum);
        //将nextTime月份加1/3/6/12，set lastTime为nextTime
        String nextTime = tenantContract.getNextTime();
        String pway = tenantContract.getPway();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String nextRealTime = null;
        try {
            Date nextDateTime = formatter.parse(nextTime);
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(nextDateTime);
            if(pway.equals("月付")){
                rightNow.add(Calendar.MONTH, 1);
            }else if(pway.equals("季付")){
                rightNow.add(Calendar.MONTH, 3);
            }else if(pway.equals("半年付")){
                rightNow.add(Calendar.MONTH, 6);
            }else {
                rightNow.add(Calendar.YEAR, 1);
            }
            Date time = rightNow.getTime();
            nextRealTime = formatter.format(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int m = customerPersonalDao.changeTransactionTime(aptNum,nextTime,nextRealTime);
        return i;
    }

    @Override
    public List<TransactionRecord> loadTransactionRecord(Integer tenantId) {
        return customerPersonalDao.loadTransactionRecord(tenantId);
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse("2019-12-10");
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, 1);
        Date time = rightNow.getTime();
        String dateString = sdf.format(time);
        System.out.println(dateString);
    }
}
