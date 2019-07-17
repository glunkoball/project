package aaa.project.entity;

public class Apartment {
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
    //房源配套信息
    private Boolean elevator;//电梯
    private Boolean parking;//停车位
    private Boolean internet;//宽带
    private Boolean bed;//床
    private Boolean sofa;//沙发
    private Boolean chair;//椅子
    private Boolean TV;//电视
    private Boolean AC;//空调
    private Boolean refrigerator;//冰箱
    private Boolean washer;//洗衣机
    private Boolean gas;//燃气
    private Boolean colony;//阳台
    //出租方式以及租金
    private Boolean allCharged;//托管
    private Boolean together;//整租
    private Boolean split;//合租
    private Boolean decoration;//申请装修后合租
    private String paymentMethods;//付款方式(押一付一，押一付三，无押金月付，半年付，年付)
    private String moveinDate;//搬入时间
    private Boolean waterFee;//负责水费
    private Boolean electricityFee;//负责电费
    private Boolean gasFee;//负责燃气费
    private Boolean InternetFee;//负责网费
    private Boolean communityFee;//负责物业费
    private Boolean wireFee;//负责有线电视费
    private Boolean parkingFee;//负责停车费
    //出租要求
    private Boolean pet;//宠物
    private Boolean smoking;//吸烟
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
    private Boolean key;//是否交钥匙
    private String checkAptTime;//看房时间(仅周末，仅工作日，随时看房)
    private String description;//描述

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

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Boolean getBed() {
        return bed;
    }

    public void setBed(Boolean bed) {
        this.bed = bed;
    }

    public Boolean getSofa() {
        return sofa;
    }

    public void setSofa(Boolean sofa) {
        this.sofa = sofa;
    }

    public Boolean getChair() {
        return chair;
    }

    public void setChair(Boolean chair) {
        this.chair = chair;
    }

    public Boolean getTV() {
        return TV;
    }

    public void setTV(Boolean TV) {
        this.TV = TV;
    }

    public Boolean getAC() {
        return AC;
    }

    public void setAC(Boolean AC) {
        this.AC = AC;
    }

    public Boolean getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Boolean refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Boolean getWasher() {
        return washer;
    }

    public void setWasher(Boolean washer) {
        this.washer = washer;
    }

    public Boolean getGas() {
        return gas;
    }

    public void setGas(Boolean gas) {
        this.gas = gas;
    }

    public Boolean getColony() {
        return colony;
    }

    public void setColony(Boolean colony) {
        this.colony = colony;
    }

    public Boolean getAllCharged() {
        return allCharged;
    }

    public void setAllCharged(Boolean allCharged) {
        this.allCharged = allCharged;
    }

    public Boolean getTogether() {
        return together;
    }

    public void setTogether(Boolean together) {
        this.together = together;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public Boolean getDecoration() {
        return decoration;
    }

    public void setDecoration(Boolean decoration) {
        this.decoration = decoration;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public String getMoveinDate() {
        return moveinDate;
    }

    public void setMoveinDate(String moveinDate) {
        this.moveinDate = moveinDate;
    }

    public Boolean getPet() {
        return pet;
    }

    public void setPet(Boolean pet) {
        this.pet = pet;
    }

    public Boolean getSmoking() {
        return smoking;
    }

    public void setSmoking(Boolean smoking) {
        this.smoking = smoking;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
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

    public Boolean getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(Boolean waterFee) {
        this.waterFee = waterFee;
    }

    public Boolean getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(Boolean electricityFee) {
        this.electricityFee = electricityFee;
    }

    public Boolean getGasFee() {
        return gasFee;
    }

    public void setGasFee(Boolean gasFee) {
        this.gasFee = gasFee;
    }

    public Boolean getInternetFee() {
        return InternetFee;
    }

    public void setInternetFee(Boolean internetFee) {
        InternetFee = internetFee;
    }

    public Boolean getCommunityFee() {
        return communityFee;
    }

    public void setCommunityFee(Boolean communityFee) {
        this.communityFee = communityFee;
    }

    public Boolean getWireFee() {
        return wireFee;
    }

    public void setWireFee(Boolean wireFee) {
        this.wireFee = wireFee;
    }

    public Boolean getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(Boolean parkingFee) {
        this.parkingFee = parkingFee;
    }
}
