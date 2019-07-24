package aaa.project.service.impl;

import aaa.project.dao.CustomerPersonalDao;
import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.service.CustomerPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CustomerPersonalServiceImpl implements CustomerPersonalService {

    @Autowired
    private CustomerPersonalDao customerPersonalDao;

    @Override
    public List<Apartment> findAllMyApt(Integer Id) {
        List<Apartment> list = customerPersonalDao.showAllMyApt(Id);
        return list;
    }

    @Override
    public List<OwerContract> ShowJiaContract(Integer OwnerId) {
        return customerPersonalDao.showJiaContract(OwnerId);
    }

    @Override
    public List<TenantContract> ShowYiContract(Integer tenantId) {
        return customerPersonalDao.showYiContract(tenantId);
    }
}
