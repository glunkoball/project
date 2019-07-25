package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
@Mapper
public interface CustomerPersonalDao {

    public List<Apartment> showAllMyApt(@RequestBody Integer Id);

    public List<OwerContract> showJiaContract(@RequestBody Integer ownerId);

    public List<TenantContract> showYiContract(@RequestBody Integer tenantId);

//    public List<TenantContract> loadToPayList(@RequestBody Integer tenantId);

}
