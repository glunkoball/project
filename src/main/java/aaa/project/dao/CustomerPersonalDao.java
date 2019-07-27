package aaa.project.dao;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.entity.TransactionRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Mapper
public interface CustomerPersonalDao {

    public List<Apartment> showAllMyApt(@RequestBody Integer Id);

    public List<OwerContract> showJiaContract(@RequestBody Integer ownerId);

    public List<TenantContract> showYiContract(@RequestBody Integer tenantId);

//  public List<TenantContract> loadToPayList(@RequestBody Integer tenantId);

    public int setIntoRecord(@RequestBody TransactionRecord transactionRecord);

    public TenantContract showNextTime(@RequestBody String aptNum);

    public int changeTransactionTime(@Param("aptNum") String aptNum, @Param("nextTime") String nextTime, @Param("nextRealTime") String nextRealTime);

    public List<TransactionRecord> loadTransactionRecord(@RequestBody Integer tenantId);

}
