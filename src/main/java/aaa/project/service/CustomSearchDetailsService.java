package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;

import java.util.List;

public interface CustomSearchDetailsService {
    public Apartment findOneHome(String aptNum);
    public DefaultMsg save(InterestedCustom custom);

}
