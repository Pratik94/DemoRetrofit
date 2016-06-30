package com.example.pratik.demoretrofit;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by pratik on 28/06/16.
 */
@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {

    public static final String NAME = "MyDataBase";

    public static final int VERSION = 1;
}