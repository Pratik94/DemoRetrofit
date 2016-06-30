package com.example.pratik.demoretrofit;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

/**
 * Created by pratik on 21/04/16.
 */
@Table(database = MyDatabase.class)
@Parcel(analyze = {Brand.class})
public class Brand extends BaseModel {

    @Column
    @PrimaryKey
    int id;

    @Column
    public int BrandID;

    @Column
    public String BrandName;

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int brandID) {
        BrandID = brandID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

}
