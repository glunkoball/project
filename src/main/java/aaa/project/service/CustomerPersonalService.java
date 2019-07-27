package aaa.project.service;

import aaa.project.entity.Apartment;
import aaa.project.entity.OwerContract;
import aaa.project.entity.TenantContract;
import aaa.project.entity.TransactionRecord;

import java.util.List;

public interface CustomerPersonalService {

    public List<Apartment> findAllMyApt(Integer Id);

    public List<OwerContract> ShowJiaContract(Integer OwnerId);

    public List<TenantContract> ShowYiContract(Integer tenantId);

    public List<TenantContract> loadToPayList(Integer tenantId);

    public int setIntoRecord(TransactionRecord transactionRecord);

    public List<TransactionRecord> loadTransactionRecord(Integer tenantId);
}
