package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.dao.CheckApartmentDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;
import aaa.project.service.CheckApartmentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckApartmentServiceImpl implements CheckApartmentService {
    @Autowired
    private CheckApartmentDao checkApartmentDao;
    @Override
    public PageModel<Capt> listCapt(Integer currentPage, Integer pageSize) {
        PageModel<Capt> pm = new PageModel<Capt>();
        Integer start =(currentPage-1)*pageSize;
        Subject subject = SecurityUtils.getSubject();
        Admin ad = (Admin)subject.getPrincipal();
        //查询总条数
        pm.setTotal(checkApartmentDao.countCapt(ad.getId()));
        //查询每页的数据
        List<Capt> custominfoList =checkApartmentDao.listCapt(start,pageSize,ad.getId());
        pm.setRows(custominfoList);
        return pm;
    }

    @Override
    public DefaultMsg deleteCapt(String aptNum, Integer customid) {
        DefaultMsg dm = new DefaultMsg();
        Integer count =0;
        if(aptNum!=null){
            count=checkApartmentDao.deleteCapt(aptNum,customid);
            if(count<1){
               dm.setSuccess(0);
               dm.setError("删除失败，请重试");
            }
        }else{
            dm.setSuccess(0);
            dm.setError("删除失败，参数为空");
        }
        return dm;
    }


}
