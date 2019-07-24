package aaa.project.entity;

import java.util.List;

public class Custominfo {
    private Integer customid;
    private String customname;
    private String customphone;
    private String customemail;
    private String wayy;
    private String customdesc;
    private String custTime;//预约看房时间

    public String getCustTime() {
        return custTime;
    }

    public void setCustTime(String custTime) {
        this.custTime = custTime;
    }

    //房源一对多
    private List<Apartment> apartments;

    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname;
    }

    public String getCustomphone() {
        return customphone;
    }

    public void setCustomphone(String customphone) {
        this.customphone = customphone;
    }

    public String getCustomemail() {
        return customemail;
    }

    public void setCustomemail(String customemail) {
        this.customemail = customemail;
    }

    public String getWayy() {
        return wayy;
    }

    public void setWayy(String wayy) {
        this.wayy = wayy;
    }

    public String getCustomdesc() {
        return customdesc;
    }

    public void setCustomdesc(String customdesc) {
        this.customdesc = customdesc;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }
}
