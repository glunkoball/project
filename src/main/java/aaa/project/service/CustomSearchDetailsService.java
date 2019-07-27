package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Apartment;
import aaa.project.entity.InterestedCustom;
import aaa.project.entity.OwerContract;

import java.util.List;

public interface CustomSearchDetailsService {
    public Apartment findOneHome(String aptNum);
    public DefaultMsg save(InterestedCustom custom);

    PageModel<OwerContract> listOwercontract(String aptNum);

    public List<Apartment> loadPictures(String aptNum);
}
