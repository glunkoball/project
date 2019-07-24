package aaa.project.entity;

import java.util.ArrayList;
import java.util.Date;

public class Apartment {
    //状态名
    private   String statusname;

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    //房源对应一个房东
    private User user;

    public User getUser() {
        return user;
    }

    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //房屋基本信息
    private String AptNum;//房源编号
    private Integer bedrooms;//卧室
    private Integer bathrooms;//卫生间
    private Integer livingrooms;//厅
    private Double area;//面积
    private String facing;//朝向
    private String city;//城市
    private String district;//区
    private String community;//小区
    private Integer whichfloor;//楼层
    private Integer totalfloor;//总楼层
    private Integer uid;//房东ID
    private Integer state;//审核状态
    private Integer aid;//负责经纪人ID
    //房源配套信息
    private ArrayList facility;
    private Integer elevator;//电梯
    private Integer parking;//停车位
    private Integer internet;//宽带
    private Integer bed;//床
    private Integer sofa;//沙发
    private Integer chair;//椅子
    private Integer TV;//电视
    private Integer AC;//空调
    private Integer refrigerator;//冰箱
    private Integer washer;//洗衣机
    private Integer gas;//燃气
    private Integer colony;//阳台
    //出租方式以及租金
    private ArrayList rentMethods;
    private String rentMethodsForSearch;
    private Integer allCharged;//托管
    private Integer together;//整租
    private Integer split;//合租
    private Integer decoration;//申请装修后合租
    private String paymentMethods;//付款方式(押一付一，押一付三，无押金月付，半年付，年付)
    private Double price;//租金
    private String moveinDate;//搬入时间
    private ArrayList includedService;
    private Integer waterFee;//负责水费
    private Integer electricityFee;//负责电费
    private Integer gasFee;//负责燃气费
    private Integer InternetFee;//负责网费
    private Integer communityFee;//负责物业费
    private Integer wireFee;//负责有线电视费
    private Integer parkingFee;//负责停车费
    //出租要求
    private ArrayList rentRequirement;

    private Integer pet;//宠物
    private Integer smoking;//吸烟
    //房源照片最多四张
/*  private String url1;
    private String url2;
    private String url3;
    private String url4;
*/
    //需要审核的有效证件
 /*   private String url5;//房产证明
    private String url6;//身份证
*/
    //其他信息
    private Integer isKey;//是否交钥匙
    private ArrayList checkAptList; //看房数组
    private String  checkAptTime;//看房时间(仅周末，仅工作日，随时看房)
    private String description;//描述
    //钥匙
    private String address;//房屋地址
    private String contact;//经纪人联系方式
    private Integer keystate;//钥匙状态
    private Date date;//上次借出时间
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAptNum() {
        return AptNum;
    }

    public void setAptNum(String aptNum) {
        AptNum = aptNum;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getLivingrooms() {
        return livingrooms;
    }

    public void setLivingrooms(Integer livingrooms) {
        this.livingrooms = livingrooms;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public Integer getWhichfloor() {
        return whichfloor;
    }

    public void setWhichfloor(Integer whichfloor) {
        this.whichfloor = whichfloor;
    }

    public Integer getTotalfloor() {
        return totalfloor;
    }

    public void setTotalfloor(Integer totalfloor) {
        this.totalfloor = totalfloor;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public ArrayList getFacility() {
        return facility;
    }

    public void setFacility(ArrayList facility) {
        this.facility = facility;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Integer getParking() {
        return parking;
    }

    public void setParking(Integer parking) {
        this.parking = parking;
    }

    public Integer getInternet() {
        return internet;
    }

    public void setInternet(Integer internet) {
        this.internet = internet;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public Integer getSofa() {
        return sofa;
    }

    public void setSofa(Integer sofa) {
        this.sofa = sofa;
    }

    public Integer getChair() {
        return chair;
    }

    public void setChair(Integer chair) {
        this.chair = chair;
    }

    public Integer getTV() {
        return TV;
    }

    public void setTV(Integer TV) {
        this.TV = TV;
    }

    public Integer getAC() {
        return AC;
    }

    public void setAC(Integer AC) {
        this.AC = AC;
    }

    public Integer getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Integer refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Integer getWasher() {
        return washer;
    }

    public void setWasher(Integer washer) {
        this.washer = washer;
    }

    public Integer getGas() {
        return gas;
    }

    public void setGas(Integer gas) {
        this.gas = gas;
    }

    public Integer getColony() {
        return colony;
    }

    public void setColony(Integer colony) {
        this.colony = colony;
    }



    public Integer getAllCharged() {
        return allCharged;
    }

    public void setAllCharged(Integer allCharged) {
        this.allCharged = allCharged;
    }

    public Integer getTogether() {
        return together;
    }

    public void setTogether(Integer together) {
        this.together = together;
    }

    public Integer getSplit() {
        return split;
    }

    public void setSplit(Integer split) {
        this.split = split;
    }

    public Integer getDecoration() {
        return decoration;
    }

    public void setDecoration(Integer decoration) {
        this.decoration = decoration;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMoveinDate() {
        return moveinDate;
    }

    public void setMoveinDate(String moveinDate) {
        this.moveinDate = moveinDate;
    }



    public Integer getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(Integer waterFee) {
        this.waterFee = waterFee;
    }

    public Integer getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(Integer electricityFee) {
        this.electricityFee = electricityFee;
    }

    public Integer getGasFee() {
        return gasFee;
    }

    public void setGasFee(Integer gasFee) {
        this.gasFee = gasFee;
    }

    public Integer getInternetFee() {
        return InternetFee;
    }

    public void setInternetFee(Integer internetFee) {
        InternetFee = internetFee;
    }

    public Integer getCommunityFee() {
        return communityFee;
    }

    public void setCommunityFee(Integer communityFee) {
        this.communityFee = communityFee;
    }

    public Integer getWireFee() {
        return wireFee;
    }

    public void setWireFee(Integer wireFee) {
        this.wireFee = wireFee;
    }

    public Integer getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(Integer parkingFee) {
        this.parkingFee = parkingFee;
    }



    public Integer getPet() {
        return pet;
    }

    public void setPet(Integer pet) {
        this.pet = pet;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public void setSmoking(Integer smoking) {
        this.smoking = smoking;
    }

    public Integer getIsKey() {
        return isKey;
    }

    public void setIsKey(Integer isKey) {
        this.isKey = isKey;
    }

    public ArrayList getCheckAptList() {
        return checkAptList;
    }

    public void setCheckAptList(ArrayList checkAptList) {
        this.checkAptList = checkAptList;
    }

    public String getCheckAptTime() {
        return checkAptTime;
    }

    public void setCheckAptTime(String checkAptTime) {
        this.checkAptTime = checkAptTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getRentMethods() {
        return rentMethods;
    }

    public void setRentMethods(ArrayList rentMethods) {
        this.rentMethods = rentMethods;
    }

    public ArrayList getIncludedService() {
        return includedService;
    }

    public void setIncludedService(ArrayList includedService) {
        this.includedService = includedService;
    }

    public ArrayList getRentRequirement() {
        return rentRequirement;
    }

    public void setRentRequirement(ArrayList rentRequirement) {
        this.rentRequirement = rentRequirement;
    }

    public String getRentMethodsForSearch() {
        return rentMethodsForSearch;
    }

    public void setRentMethodsForSearch(String rentMethodsForSearch) {
        this.rentMethodsForSearch = rentMethodsForSearch;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getKeystate() {
        return keystate;
    }

    public void setKeystate(Integer keystate) {
        this.keystate = keystate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
