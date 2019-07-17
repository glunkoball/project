package aaa.project.service.impl;

import aaa.project.common.DefaultMsg;
import aaa.project.dao.SigninDao;
import aaa.project.entity.User;
import aaa.project.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SigninServiceImpl implements SigninService {
    @Autowired
    private SigninDao signinDao;
    @Override
    public DefaultMsg signinUser(User user) {
        Integer count =0;
        DefaultMsg dm = new DefaultMsg();
        count = signinDao.countUserName(user);
        if(count == 0){
           count = signinDao.signinUser(user);
           if(count < 1){
               dm.setSuccess(0);
               dm.setError("服务注册失败");
           }
        }else {
            dm.setSuccess(0);
            dm.setError("邮箱已经注册，注册失败");
        }
        return dm;
    }
}
