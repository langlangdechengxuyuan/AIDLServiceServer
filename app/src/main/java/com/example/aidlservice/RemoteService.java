package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

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

    public class RemoteBinder extends IRemoteService.Stub {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            Log.d("RemoteBinder-basicTypes", anInt + ":" + aLong + ":" + aString + "  Thread= " + Thread.currentThread());
            final String str = anInt + ":" + aLong + ":" + aString;
//        Toast.makeText(ApplicationWrapper.getContext(), str, Toast.LENGTH_SHORT).show();
        }

        @Override
        public int getPid(IMyAidlCallback callback) throws RemoteException {
            Log.d("RemoteBinder-getPid", "  Thread= " + Thread.currentThread());
            if(null != callback){
                callback.onCallback("i am remote callback");
            }
            return Process.myPid();
        }

        @Override
        public void save(Person person) throws RemoteException {

        }

        @Override
        public Person getPerson() throws RemoteException {
            return new Person(25, "chaoge");
        }
    }

}
