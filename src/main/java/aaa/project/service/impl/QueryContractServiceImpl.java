package aaa.project.service.impl;

import aaa.project.common.PageModel;
import aaa.project.dao.QueryContractDao;
import aaa.project.entity.OwerContract;
import aaa.project.service.QueryContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QueryContractServiceImpl implements QueryContractService {
    @Autowired
    private QueryContractDao queryContractDao;
    @Override
    public PageModel<OwerContract> listContract(String keyword, Integer currentPage, Integer pageSize) {
        PageModel<OwerContract> pm= new PageModel<OwerContract>();
        Integer start=(currentPage-1)*pageSize;
        pm.setRows(queryContractDao.listContract(keyword,start,pageSize));
        pm.setTotal(queryContractDao.countContract(keyword));
        return pm;
    }
}
