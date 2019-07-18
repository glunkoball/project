package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.dao.CustomerPublishApartmentDao;
import aaa.project.entity.Apartment;
import aaa.project.service.CustomerPublishApartmentService;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
@Transactional
public class CustomerPublishApartmentServiceImpl implements CustomerPublishApartmentService {
    @Autowired
    private CustomerPublishApartmentDao customerPublishApartmentDao;
    @Override
    public DefaultMsg publishApt(Apartment apartment) {
        Integer count =0;
        DefaultMsg dm = new DefaultMsg();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sdf.format(date);
        System.out.println("日期字符串："+format);
        apartment.setAptNum(format);
       count =customerPublishApartmentDao.publishApt1(apartment);
        ArrayList facility = apartment.getFacility();
        System.out.println(facility.size());
        for(int i =0;i<facility.size();i++){
            if(facility.get(i).equals("网络")){
                apartment.setInternet(1);
            }else if(facility.get(i).equals("床")){
                apartment.setBed(1);
            }else if(facility.get(i).equals("沙发")){
                apartment.setSofa(1);
            }else if(facility.get(i).equals("桌椅")){
                apartment.setChair(1);
            }else if(facility.get(i).equals("电视")){
                apartment.setTV(1);
            }else if(facility.get(i).equals("空调")){
                apartment.setAC(1);
            }else if(facility.get(i).equals("冰箱")){
                apartment.setRefrigerator(1);
            }else if(facility.get(i).equals("洗衣机")){
                apartment.setWasher(1);
            }else if(facility.get(i).equals("燃气")){
                apartment.setGas(1);
            }else if(facility.get(i).equals("阳台")){
                apartment.setColony(1);
            }
        }
       count =customerPublishApartmentDao.publishApt2(apartment);
        ArrayList rentMethods = apartment.getRentMethods();
        for(int i = 0; i<rentMethods.size();i++){
            if(rentMethods.get(i).equals("托管")){
                apartment.setAllCharged(1);
            }else if(rentMethods.get(i).equals("整租")){
                apartment.setTogether(1);
            }else if(rentMethods.get(i).equals("合租")){
                apartment.setSplit(1);
            }else if(rentMethods.get(i).equals("装修出租")){
                apartment.setDecoration(1);
            }
        }
        ArrayList includedService = apartment.getIncludedService();
        for(int i = 0; i<includedService.size();i++){
            if(includedService.get(i).equals("水费")){
                apartment.setWaterFee(1);
            }else if(includedService.get(i).equals("电费")){
                apartment.setElectricityFee(1);
            }else if(includedService.get(i).equals("燃气费")){
                apartment.setGasFee(1);
            }else if(includedService.get(i).equals("宽带费")){
                apartment.setInternetFee(1);
            }else if(includedService.get(i).equals("物业费")){
                apartment.setCommunityFee(1);
            }else if(includedService.get(i).equals("有线电视费")){
                apartment.setWireFee(1);
            }else if(includedService.get(i).equals("停车费")){
                apartment.setParkingFee(1);
            }
        }
        ArrayList rentRequirement = apartment.getRentRequirement();
        for(int i = 0; i<rentRequirement.size();i++) {
            if (rentRequirement.get(i).equals("禁烟")) {
                apartment.setSmoking(1);
            } else if (rentRequirement.get(i).equals("禁宠物")) {
                apartment.setPet(1);
            }
        }
        ArrayList checkAptList = apartment.getCheckAptList();
        String str = StringUtils.join(checkAptList,',');
        System.out.println(str);
        apartment.setCheckAptTime(str);

        count =customerPublishApartmentDao.publishApt3(apartment);
        if(count<1){
            dm.setSuccess(0);
            dm.setError("发布房源失败，请刷新重试");
        }
        return dm;
    }
}
