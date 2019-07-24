package aaa.project.po;

import aaa.project.entity.TenantContract;

public class Zform {
    private String aptNum;
    private Integer identification;
    private TenantContract tenantContract;

    public TenantContract getTenantContract() {
        return tenantContract;
    }

    public void setTenantContract(TenantContract tenantContract) {
        this.tenantContract = tenantContract;
    }

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }




}
