package com.example.pratik.demoretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.parceler.Parcels;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Gson gson = new GsonBuilder().create();

        LoginResponse loginResponse = Parcels.unwrap(getIntent().getParcelableExtra("Login"));


        ArrayList<ActiveJobResponse> activeJobResponses = Parcels.unwrap(getIntent().getParcelableExtra("Active"));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
