package aaa.project.entity;

/**
 * 乙方合同实体类
 */
public class TenantContract {

    private Integer tenant;
    private String aptNum;
    private Integer tenantid;
    private String pway;
    private Integer peroid;
    private Double money;
    private String date1;
    private String date2;
    private Integer pid;
    private Apartment apartment;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTenant() {
        return tenant;
    }

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public String getPway() {
        return pway;
    }

    public void setPway(String pway) {
        this.pway = pway;
    }

    public Integer getPeroid() {
        return peroid;
    }

    public void setPeroid(Integer peroid) {
        this.peroid = peroid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
