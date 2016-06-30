package com.example.pratik.demoretrofit;

/**
 * Created by pratik on 14/04/16.
 */

@org.parceler.Parcel
public class LoginRequest{

    public String Imei;

    public String PhoneNumber;

    public LoginRequest(){

    }

    public void setImei(String imei) {
        Imei = imei;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

}
