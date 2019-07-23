package aaa.project.service.impl;

import aaa.project.common.PageModel;
import aaa.project.dao.InterestedManagementDao;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
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
        Subject subject = SecurityUtils.getSubject();
        Admin ad = (Admin)subject.getPrincipal();
        pm.setTotal(interestedManagementDao.countInterestedManagement(ad.getId()));
        pm.setRows(interestedManagementDao.listInterestedManagement(currentPage,pageSize,ad.getId()));
        return pm;
    }
}
