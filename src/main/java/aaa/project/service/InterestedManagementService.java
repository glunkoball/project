package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Apartment;
import aaa.project.entity.Custominfo;

public interface InterestedManagementService {
    PageModel<Apartment> listInterestedManagement(Integer currentPage,Integer pageSize);

    PageModel<Custominfo> listCustominfo(String aptNum);

    DefaultMsg addCustTime(String custTime, Integer customid,String aptNum);

    DefaultMsg deleteCust(Integer customid, String aptNum);
}
