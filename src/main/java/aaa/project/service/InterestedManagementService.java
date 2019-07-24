package aaa.project.service;

import aaa.project.common.PageModel;
import aaa.project.entity.Apartment;

public interface InterestedManagementService {
    PageModel<Apartment> listInterestedManagement(Integer currentPage,Integer pageSize);
}
