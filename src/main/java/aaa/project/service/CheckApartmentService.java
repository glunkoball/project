package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.common.PageModel;
import aaa.project.entity.Capt;
import aaa.project.entity.Custominfo;
import org.apache.ibatis.annotations.Param;

public interface CheckApartmentService {

    PageModel<Capt> listCapt(@Param("currentPage") Integer currentPage, @Param("defaultPageSize") Integer defaultPageSize);

    DefaultMsg deleteCapt(@Param("aptNum") String aptNum,@Param("customid") Integer customid);
}
