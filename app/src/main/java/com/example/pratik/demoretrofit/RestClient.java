package com.example.pratik.demoretrofit;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pratik on 14/04/16.
 */

public class RestClient {


    public static final RestClient instance = new RestClient();

    private ApiService apiService;

    public static String BASE_URL = "";/*BuildConfig.DEBUG
            ? "http://staging.servify.in/v1/live/engineer/index.php"
            : "https://app.servify.in/v1/engineer/index.php";*/


    public RestClient() {


        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        return f.getDeclaredClass().equals(ModelAdapter.class);
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        return false;
                    }
                })
                .create();

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.connectTimeout(45,TimeUnit.SECONDS).readTimeout(45,TimeUnit.SECONDS).writeTimeout(45,TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            //  BASE_URL = "http://staging.servify.in:5000/api/v1/ServicelocationEngineers";

            BASE_URL = "http://staging.servify.in:8000/api/v1/";
//            BASE_URL = "http://192.168.0.5:5000/api/v1/";

//             BASE_URL = "http://192.168.1.84:5000/api/v1/";
            //  BASE_URL ="http://172.21.3.157:7888";

            // BASE_URL = "192.168.1.63:5000";
            // BASE_URL = "http://staging.servify.in/demo/engineer";
        } else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
            BASE_URL = "https://app.servify.in/v1/engineer/";
        }

        // BASE_URL = "http://192.168.1.84:5000/api/v1/";


        OkHttpClient client = clientBuilder.addInterceptor(interceptor).build();


        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    public ApiService getApiService() {
        return apiService;
    }


    /*RequestInterceptor requestInterceptor = new RequestInterceptor() {
        @Override
        public void intercept(RequestFacade request) {
            request.addHeader(Constants.api.HEADER_API_KEY, Constants.api.API_TEST_KEY);
        }
    };*/

}