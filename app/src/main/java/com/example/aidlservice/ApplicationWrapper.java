package com.example.aidlservice;

import android.app.Application;
import android.content.Context;

/**
 * Created by 15901 on 2018/3/16.
 */

public class ApplicationWrapper extends Application {

    private static ApplicationWrapper sWrapper;

    @Override
    public void onCreate() {
        super.onCreate();
        sWrapper = this;
    }

    public static Context getContext(){
        return sWrapper.getApplicationContext();
    }

}
