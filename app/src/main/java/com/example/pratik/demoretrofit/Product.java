package com.example.pratik.demoretrofit;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

/**
 * Created by pratik on 28/06/16.
 */

@Table(database = MyDatabase.class)
@Parcel(analyze = {AccessToken.class})
public class Product extends BaseModel {

    @Column
    @PrimaryKey
    int id;

    @Column
    public int ProductID;

    @Column
    public String ProductName;

    @Column
    public int ProductCategoryID;

    @Column
    public int ProductSubCategoryID;

    @Column
    public int BrandID;

    @Column
    public String ImagePath;

    @Column
    public String CreatedDate;

    @Column
    public boolean IsSupported;

    @Column
    @ForeignKey(saveForeignKeyModel = true)
    public Brand Brand;

    public Product(){

    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductCategoryID() {
        return ProductCategoryID;
    }

    public void setProductCategoryID(int productCategoryID) {
        ProductCategoryID = productCategoryID;
    }

    public int getProductSubCategoryID() {
        return ProductSubCategoryID;
    }

    public void setProductSubCategoryID(int productSubCategoryID) {
        ProductSubCategoryID = productSubCategoryID;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int brandID) {
        BrandID = brandID;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public boolean isSupported() {
        return IsSupported;
    }

    public void setSupported(boolean supported) {
        IsSupported = supported;
    }

    public com.example.pratik.demoretrofit.Brand getBrand() {
        return Brand;
    }

    public void setBrand(com.example.pratik.demoretrofit.Brand brand) {
        Brand = brand;
    }
}
