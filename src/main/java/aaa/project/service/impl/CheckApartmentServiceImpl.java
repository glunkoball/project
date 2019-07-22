package aaa.project.service.impl;

import aaa.project.common.PageModel;
import aaa.project.dao.CheckApartmentDao;
import aaa.project.entity.Custominfo;
import aaa.project.service.CheckApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckApartmentServiceImpl implements CheckApartmentService {
    @Autowired
    private CheckApartmentDao checkApartmentDao;
    @Override
    public PageModel<Custominfo> listCustomInfo(Integer currentPage, Integer defaultPageSize) {
        PageModel<Custominfo> pm = new PageModel<Custominfo>();
        //查询总条数
        pm.setTotal(checkApartmentDao.countCustominfo(currentPage,defaultPageSize));
        //查询每页的数据
        List<Custominfo> custominfoList =checkApartmentDao.listCustomInfo(currentPage,defaultPageSize);
        pm.setRows(custominfoList);
        return pm;
    }
}
