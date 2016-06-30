package com.example.pratik.demoretrofit;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by pratik on 14/04/16.
 */
public interface ApiService {


    @GET("Consumer/appConfig")
    Call<ServifyResponse<Config>> getConfig();


    @POST("Xpert/engineerLogin")
    Call<ServifyResponse<LoginResponse>> loginEngineer(@Body LoginRequest loginRequest);

    @POST("Xpert/getActiveJobDetails")
    Call<ServifyResponse<ArrayList<ActiveJobResponse>>> getActivejobs(@Body HashMap<String,Object> params);


    @GET("Products/getAllProductList")
    Call<ServifyResponse<ArrayList<Product>>> getProducts();


}
