package aaa.project.service.impl;

import aaa.project.dao.AdminLoginDao;
import aaa.project.dao.AdminPayToFdDao;
import aaa.project.entity.OwerContract;
import aaa.project.service.AdminPayToFdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AdminPayToFdServiceImpl implements AdminPayToFdService {
   @Autowired
   private AdminPayToFdDao adminPayToFdDao;
    @Override
    public List<OwerContract> findowercontract(String keyword) {
        return adminPayToFdDao.findowercontract(keyword);
    }
}
