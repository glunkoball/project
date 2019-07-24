package aaa.project.entity;

public class Capt {
    private String aptNum;
    private Integer customid;
    private String custTime;
    //一对一房源
    private Apartment apartment;
    //一对一有兴趣的人
    private Custominfo custominfo;

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }

    public String getCustTime() {
        return custTime;
    }

    public void setCustTime(String custTime) {
        this.custTime = custTime;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Custominfo getCustominfo() {
        return custominfo;
    }

    public void setCustominfo(Custominfo custominfo) {
        this.custominfo = custominfo;
    }
}
