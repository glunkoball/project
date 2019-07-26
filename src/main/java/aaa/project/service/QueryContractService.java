package aaa.project.service;

import aaa.project.common.PageModel;
import aaa.project.entity.OwerContract;

public interface QueryContractService {
    PageModel<OwerContract> listContract(String keyword, Integer currentPage, Integer pageSize);
}
