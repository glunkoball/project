package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.dao.CustomSearchDetailsDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
import aaa.project.entity.OwerContract;
import aaa.project.service.CustomSearchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomSearchDetailsServiceImpl  implements CustomSearchDetailsService
{
    @Autowired
    private CustomSearchDetailsDao customSearchDetailsDao;
    @Override
    public Apartment findOneHome(String aptNum) {
        return customSearchDetailsDao.findOneHome(aptNum);
    }

    @Override
    public DefaultMsg save(InterestedCustom custom) {
        Integer count=0;
        if(custom.getCustomid()==null){

            count= customSearchDetailsDao.save(custom);
//            customSearchDetailsDao.insertCusWithApart(custom,apartNum);
            System.out.println("adqqs"+custom.getCustomid());
        }
        DefaultMsg dm = new DefaultMsg();
        if(count==0){
                dm.setSuccess(0);
                dm.setError("操作失败");
        }

        return dm;
    }

    @Override
    public PageModel<OwerContract> listOwercontract(String aptNum) {
        PageModel<OwerContract> pm = new PageModel<OwerContract>();
        if(aptNum !=null){
            pm.setRows(customSearchDetailsDao.listOwercontract(aptNum));
        }
        return pm;
    }

    @Override
    public List<Apartment> loadPictures(String aptNum) {
        return customSearchDetailsDao.loadPictures(aptNum);
    }

    @Override
    public void bindca(Integer customid, String aptNum) {
        customSearchDetailsDao.bindca(aptNum,customid);
    }

    @Override
    public Admin findBroker(Integer aid) {
        return customSearchDetailsDao.findBroker(aid);
    }


}
