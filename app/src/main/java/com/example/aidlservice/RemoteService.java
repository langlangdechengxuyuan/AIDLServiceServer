package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by 15901 on 2018/3/16.
 */

public class RemoteService extends Service {

    private RemoteBinder mRemoteBinder = new RemoteBinder();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mRemoteBinder;
    }



}
