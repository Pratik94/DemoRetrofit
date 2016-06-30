package com.example.pratik.demoretrofit;

import java.util.ArrayList;

/**
 * Created by pratik on 21/04/16.
 */
@org.parceler.Parcel
public class Config {
    public ArrayList<SubCategory> Products;
    public String S3baseUrl;
    public String ProductSubCategorybucket;
    public String BrandBucket;
    public String BrandIconExt;
    public int Version;
    public int androidVersion;

    public ArrayList<SubCategory> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<SubCategory> products) {
        Products = products;
    }

    public String getS3baseUrl() {
        return S3baseUrl;
    }

    public void setS3baseUrl(String s3baseUrl) {
        S3baseUrl = s3baseUrl;
    }

    public String getProductSubCategorybucket() {
        return ProductSubCategorybucket;
    }

    public void setProductSubCategorybucket(String productSubCategorybucket) {
        ProductSubCategorybucket = productSubCategorybucket;
    }

    public String getBrandBucket() {
        return BrandBucket;
    }

    public void setBrandBucket(String brandBucket) {
        BrandBucket = brandBucket;
    }

    public String getBrandIconExt() {
        return BrandIconExt;
    }

    public void setBrandIconExt(String brandIconExt) {
        BrandIconExt = brandIconExt;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

}