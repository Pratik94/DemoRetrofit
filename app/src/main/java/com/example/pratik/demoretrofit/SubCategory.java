package com.example.pratik.demoretrofit;

import java.util.ArrayList;

/**
 * Created by pratik on 21/04/16.
 */
@org.parceler.Parcel
public class SubCategory {

    public int ProductSubCategoryID;
    public String ProductSubCategory;
    public String DisplayName;
    public String ImagePath;
    public String ImageUrl;
    public ArrayList<Brand> Brand;

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

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public ArrayList<com.example.pratik.demoretrofit.Brand> getBrand() {
        return Brand;
    }

    public void setBrand(ArrayList<com.example.pratik.demoretrofit.Brand> brand) {
        Brand = brand;
    }

}