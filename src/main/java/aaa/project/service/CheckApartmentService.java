package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;

public interface CheckApartmentService {

    PageModel<Capt> listCapt(Integer currentPage, Integer defaultPageSize);

    DefaultMsg deleteCapt(String aptNum, Integer customid);
}
