package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.dao.InterestedManagementDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Custominfo;
import aaa.project.service.InterestedManagementService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InterestedManagementServiceImpl implements InterestedManagementService {
    @Autowired
    private InterestedManagementDao interestedManagementDao;
    @Override
    public PageModel<Apartment> listInterestedManagement(Integer currentPage,Integer pageSize) {
        PageModel<Apartment> pm = new PageModel<Apartment>();
        Integer start =(currentPage-1)*pageSize;
        Subject subject = SecurityUtils.getSubject();
        Admin ad = (Admin)subject.getPrincipal();
        pm.setTotal(interestedManagementDao.countInterestedManagement(ad.getId()));
        pm.setRows(interestedManagementDao.listInterestedManagement(start,pageSize,ad.getId()));
        return pm;
    }

    @Override
    public PageModel<Custominfo> listCustominfo(String aptNum) {
        PageModel<Custominfo> pm2 = new PageModel<Custominfo>();
        pm2.setRows(interestedManagementDao.listCustominfo(aptNum));
        return pm2;
    }

    @Override
    public DefaultMsg addCustTime(String custTime, Integer customid,String aptNum) {
        DefaultMsg dm = new DefaultMsg();
        Integer count =0;
        if(custTime!= null && customid!=null){
            count =interestedManagementDao.addCustTime(custTime,customid,aptNum);
            if(count<1){
                dm.setSuccess(0);
                dm.setError("预约时间失败，请重试");
            }
        }else {
            dm.setSuccess(0);
            dm.setError("预约时间失败");
        }
        return dm;
    }

    @Override
    public DefaultMsg deleteCust(Integer customid, String aptNum) {
        DefaultMsg dm = new DefaultMsg();
        Integer count =0;
        if(customid != null && aptNum!=null){
            count =interestedManagementDao.deleteCust(customid,aptNum);
            if(count<1){
                dm.setSuccess(0);
                dm.setError("删除失败，请重试");
            }
        }else{
            dm.setSuccess(0);
            dm.setError("参数为空");
        }
        return dm;
    }
}
