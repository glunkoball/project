package aaa.project.service;

import aaa.project.common.PageModel;
import aaa.project.entity.Custominfo;

public interface CheckApartmentService {

    PageModel<Custominfo> listCustomInfo(Integer currentPage, Integer defaultPageSize);
}
