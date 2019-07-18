package aaa.project.service.impl;

import aaa.project.dao.CustomSearchDetailsDao;
import aaa.project.entity.Apartment;
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
    public Apartment findOneHome() {
        return customSearchDetailsDao.findOneHome();
    }


}
