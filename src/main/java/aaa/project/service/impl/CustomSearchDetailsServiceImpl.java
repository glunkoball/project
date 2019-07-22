package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.dao.CustomSearchDetailsDao;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
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
    public DefaultMsg save(InterestedCustom custom,String aptNum) {
        Integer customId=null;
        Integer count=0;
        if(custom.getCustomid()==null){
            count=customSearchDetailsDao.save(custom);
            customId = customSearchDetailsDao.findCustomId();
            //建立房源和感兴趣人的中间表
            customSearchDetailsDao.BindCusAndApt(aptNum,customId);
        }
        DefaultMsg dm = new DefaultMsg();
        if(count==0){
                dm.setSuccess(0);
                dm.setError("操作失败");
        }

        return dm;
    }


}
