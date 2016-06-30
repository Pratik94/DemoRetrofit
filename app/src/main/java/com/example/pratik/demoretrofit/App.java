package com.example.pratik.demoretrofit;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by pratik on 15/04/16.
 */
public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        App.context = getApplicationContext();

        FlowManager.init(this);

        if (BuildConfig.DEBUG) {
            Logger.init("SERVIFY XPERT").logLevel(LogLevel.FULL);

        } else {
            Logger.init("SERVIFY XPERT")
                    .logLevel(LogLevel.NONE);
        }

    }

}
