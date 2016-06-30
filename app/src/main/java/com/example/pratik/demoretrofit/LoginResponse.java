package com.example.pratik.demoretrofit;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

/**
 * Created by pratik on 14/04/16.
 */
@Table(database = MyDatabase.class)
@Parcel(analyze = {LoginResponse.class})
public class LoginResponse extends BaseModel {

    @Column
    @PrimaryKey
    int id;

    @Column
    @ForeignKey(saveForeignKeyModel = true)
    public AccessToken accessToken;

    @Column
    public int PartnerServiceLocationID;

    @Column
    public String AssignedJobCount;

    @Column
    public String Type;

    @Column
    public String MaxProductivityPerDay;

    @Column
    public String WorkingTo;

    @Column
    public String ProductivityPerDay;

    @Column
    public String ProfileImage;

    @Column
    public boolean IsPresentToday;

    @Column
    public String WorkingFrom;

    @Column
    public String DeviceType;

    @Column
    public String Zipcode;

    @Column
    public String MobileNo;

    @Column
    public String Name;

    @Column
    public String IsLogout;

    @Column
    public String imeino;

    @Column
    public int ServiceLocationEngineerID;

    @Column
    public String Address;

    @Column
    public String ServiceLocationName;

    @Column
    public String DeviceToken;

    @Column
    public int PartnerID;

    @Column
    public String EmailID;

    @Column
    public String OtherContactNo;

    public AccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public int getPartnerServiceLocationID() {
        return PartnerServiceLocationID;
    }

    public void setPartnerServiceLocationID(int partnerServiceLocationID) {
        PartnerServiceLocationID = partnerServiceLocationID;
    }

    public String getAssignedJobCount() {
        return AssignedJobCount;
    }

    public void setAssignedJobCount(String assignedJobCount) {
        AssignedJobCount = assignedJobCount;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMaxProductivityPerDay() {
        return MaxProductivityPerDay;
    }

    public void setMaxProductivityPerDay(String maxProductivityPerDay) {
        MaxProductivityPerDay = maxProductivityPerDay;
    }

    public String getWorkingTo() {
        return WorkingTo;
    }

    public void setWorkingTo(String workingTo) {
        WorkingTo = workingTo;
    }

    public String getProductivityPerDay() {
        return ProductivityPerDay;
    }

    public void setProductivityPerDay(String productivityPerDay) {
        ProductivityPerDay = productivityPerDay;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }

    public boolean getIsPresentToday() {
        return IsPresentToday;
    }

    public void setIsPresentToday(boolean isPresentToday) {
        IsPresentToday = isPresentToday;
    }

    public String getWorkingFrom() {
        return WorkingFrom;
    }

    public void setWorkingFrom(String workingFrom) {
        WorkingFrom = workingFrom;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIsLogout() {
        return IsLogout;
    }

    public void setIsLogout(String isLogout) {
        IsLogout = isLogout;
    }

    public String getImeino() {
        return imeino;
    }

    public void setImeino(String imeino) {
        this.imeino = imeino;
    }

    public int getServiceLocationEngineerID() {
        return ServiceLocationEngineerID;
    }

    public void setServiceLocationEngineerID(int serviceLocationEngineerID) {
        ServiceLocationEngineerID = serviceLocationEngineerID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getServiceLocationName() {
        return ServiceLocationName;
    }

    public void setServiceLocationName(String serviceLocationName) {
        ServiceLocationName = serviceLocationName;
    }

    public String getDeviceToken() {
        return DeviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        DeviceToken = deviceToken;
    }

    public int getPartnerID() {
        return PartnerID;
    }

    public void setPartnerID(int partnerID) {
        PartnerID = partnerID;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getOtherContactNo() {
        return OtherContactNo;
    }

    public void setOtherContactNo(String otherContactNo) {
        OtherContactNo = otherContactNo;
    }
}
