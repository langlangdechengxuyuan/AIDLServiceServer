package com.example.aidlservice;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by 15901 on 2018/3/16.
 */

public class RemoteBinder extends IRemoteService.Stub {
    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
        Log.d("RemoteBinder-basicTypes", anInt + ":" + aLong + ":" + aString + "  Thread= " + Thread.currentThread());
        final String str = anInt + ":" + aLong + ":" + aString;
//        Toast.makeText(ApplicationWrapper.getContext(), str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getPid() throws RemoteException {
        Log.d("RemoteBinder-getPid", "  Thread= " + Thread.currentThread());
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
