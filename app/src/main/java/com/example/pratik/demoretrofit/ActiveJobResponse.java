package com.example.pratik.demoretrofit;


import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by pratik on 15/04/16.
 */
@Parcel
public class ActiveJobResponse{

    public int ConsumerServiceRequestID;
    public String Landmark;
    public String Status;
    public int ServiceTypeID;
    public String Address;
    public String Zipcode;
    public int ConsumerProductID;
    public String Description;
    public String Name;
    public String MobileNo;
    public String ImageUrl;
    public int ConsumerID;
    public String ScheduledFromTime;
    public String ScheduledToTime;
    public int ProductSubCategoryID;
    public String ProductSubCategory;
    public int ProductID;
    public int BrandID;
    public String ScheduledDateTime;
    public String ProductName;
    public String SerialNumber;
    public String ModelNo;
    public String Lat;
    public String Lng;
    public String BrandName;
    public String WarrantyTill;
    public int IsProductLevelPriceApplicable;
    public int IsUnderWarranty;
    public String IsVerified;
    public String FilePath;

    public ArrayList<Issues> Issue ;
    public String ProductImage;
    public ArrayList<Files> Files ;
    public ArrayList<Integer> Numbers = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
    }};

    public int getConsumerServiceRequestID() {
        return ConsumerServiceRequestID;
    }

    public void setConsumerServiceRequestID(int consumerServiceRequestID) {
        ConsumerServiceRequestID = consumerServiceRequestID;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getServiceTypeID() {
        return ServiceTypeID;
    }

    public void setServiceTypeID(int serviceTypeID) {
        ServiceTypeID = serviceTypeID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public int getConsumerProductID() {
        return ConsumerProductID;
    }

    public void setConsumerProductID(int consumerProductID) {
        ConsumerProductID = consumerProductID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public int getConsumerID() {
        return ConsumerID;
    }

    public void setConsumerID(int consumerID) {
        ConsumerID = consumerID;
    }

    public String getScheduledFromTime() {
        return ScheduledFromTime;
    }

    public void setScheduledFromTime(String scheduledFromTime) {
        ScheduledFromTime = scheduledFromTime;
    }

    public String getScheduledToTime() {
        return ScheduledToTime;
    }

    public void setScheduledToTime(String scheduledToTime) {
        ScheduledToTime = scheduledToTime;
    }

    public int getProductSubCategoryID() {
        return ProductSubCategoryID;
    }

    public void setProductSubCategoryID(int productSubCategoryID) {
        ProductSubCategoryID = productSubCategoryID;
    }

    public String getProductSubCategory() {
        return ProductSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        ProductSubCategory = productSubCategory;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int brandID) {
        BrandID = brandID;
    }

    public String getScheduledDateTime() {
        return ScheduledDateTime;
    }

    public void setScheduledDateTime(String scheduledDateTime) {
        ScheduledDateTime = scheduledDateTime;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String modelNo) {
        ModelNo = modelNo;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getWarrantyTill() {
        return WarrantyTill;
    }

    public void setWarrantyTill(String warrantyTill) {
        WarrantyTill = warrantyTill;
    }

    public int getIsProductLevelPriceApplicable() {
        return IsProductLevelPriceApplicable;
    }

    public void setIsProductLevelPriceApplicable(int isProductLevelPriceApplicable) {
        IsProductLevelPriceApplicable = isProductLevelPriceApplicable;
    }

    public int getIsUnderWarranty() {
        return IsUnderWarranty;
    }

    public void setIsUnderWarranty(int isUnderWarranty) {
        IsUnderWarranty = isUnderWarranty;
    }

    public String getIsVerified() {
        return IsVerified;
    }

    public void setIsVerified(String isVerified) {
        IsVerified = isVerified;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public ArrayList<Issues> getIssue() {
        return Issue;
    }

    public void setIssue(ArrayList<Issues> issue) {
        Issue = issue;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }

    public ArrayList<Files> getFiles() {
        return Files;
    }

    public void setFiles(ArrayList<Files> files) {
        Files = files;
    }

    public ArrayList<Integer> getNumbers() {
        return Numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        Numbers = numbers;
    }
}
