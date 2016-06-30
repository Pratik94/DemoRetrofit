package com.example.pratik.demoretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.raizlabs.android.dbflow.runtime.TransactionManager;
import com.raizlabs.android.dbflow.runtime.transaction.process.ProcessModelInfo;
import com.raizlabs.android.dbflow.runtime.transaction.process.SaveModelTransaction;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LoginResponse loginResponse;

    private Config config;

    private Gson gson = new GsonBuilder()
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

    View iv;

    com.example.pratik.demoretrofit.HexGrid hexGrid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        displayproducts();

        getProducts();

//        getLogin();

//        getConfig();
//
//        logIn();
//
//        getActiveJobs();

        /*iv = (View)findViewById(R.id.inVi);

        hexGrid1 = (com.example.pratik.demoretrofit.HexGrid) findViewById(R.id.hexGrid1);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv.setVisibility(View.GONE);


            }
        });*/
    }

    public void getLogin() {
        List<LoginResponse> loginlist = new Select().from(LoginResponse.class).queryList();


        Log.d("Login response ", gson.toJson(loginlist));

    }

    public void displayproducts() {
        List<Product> products = new Select().from(Product.class).queryList();


        Log.d("Products", gson.toJson(products.size()));

    }

    public void logIn() {

        final LoginRequest loginRequest = new LoginRequest();
        loginRequest.setImei("867290023070492");
        loginRequest.setPhoneNumber("8460785526");


        RestClient.instance.getApiService().loginEngineer(loginRequest).enqueue(new Callback<ServifyResponse<LoginResponse>>() {
            @Override
            public void onResponse(Call<ServifyResponse<LoginResponse>> call, Response<ServifyResponse<LoginResponse>> response) {

                ServifyResponse<LoginResponse> response1 = response.body();

                if (!response1.isSuccess()) {
                    Log.d("Not success -- ", "No");
                    return;
                }

                loginResponse = response1.getData();

                Log.d("Login response ", gson.toJson(loginResponse));

                loginResponse.save();


            }

            @Override
            public void onFailure(Call<ServifyResponse<LoginResponse>> call, Throwable t) {

                Log.d("Failure ", t.getLocalizedMessage());

            }
        });


    }

    public void getActiveJobs() {

        HashMap<String, Object> params = new HashMap<>();
        params.put("EngineerID", 166);


        RestClient.instance.getApiService().getActivejobs(params).enqueue(new Callback<ServifyResponse<ArrayList<ActiveJobResponse>>>() {
            @Override
            public void onResponse(Call<ServifyResponse<ArrayList<ActiveJobResponse>>> call, Response<ServifyResponse<ArrayList<ActiveJobResponse>>> response) {


                ServifyResponse<ArrayList<ActiveJobResponse>> response1 = response.body();

                ArrayList<ActiveJobResponse> activeJobResponses = response1.getData();
                LoginResponse lr;

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Login", Parcels.wrap(LoginResponse.class, loginResponse));
                intent.putExtra("Active", Parcels.wrap(activeJobResponses));
                startActivity(intent);

                Log.d("Active jobs ", gson.toJson(activeJobResponses));


            }

            @Override
            public void onFailure(Call<ServifyResponse<ArrayList<ActiveJobResponse>>> call, Throwable t) {

            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void getConfig() {

        RestClient.instance.getApiService().getConfig().enqueue(new Callback<ServifyResponse<Config>>() {
            @Override
            public void onResponse(Call<ServifyResponse<Config>> call, Response<ServifyResponse<Config>> response) {

                ServifyResponse<Config> response1 = response.body();

                config = response1.getData();

            }

            @Override
            public void onFailure(Call<ServifyResponse<Config>> call, Throwable t) {

            }
        });

    }

    public void getProducts() {

        RestClient.instance.getApiService().getProducts().enqueue(new Callback<ServifyResponse<ArrayList<Product>>>() {
            @Override
            public void onResponse(Call<ServifyResponse<ArrayList<Product>>> call, Response<ServifyResponse<ArrayList<Product>>> response) {

                ServifyResponse<ArrayList<Product>> response1 = response.body();

                if (response1.isSuccess()) {

                    ArrayList<Product> products = new ArrayList<Product>();

                    products = response1.getData();

                    Log.d("Products", gson.toJson(products.size()));

                    TransactionManager.getInstance().addTransaction(new SaveModelTransaction<>(ProcessModelInfo.withModels(products)));

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            displayproducts();
                        }
                    },3000);
                }
            }

            @Override
            public void onFailure(Call<ServifyResponse<ArrayList<Product>>> call, Throwable t) {

            }
        });
    }
}
