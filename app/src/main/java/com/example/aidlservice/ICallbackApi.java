package com.example.aidlservice;

import android.os.RemoteException;

/**
 * Created by 15901 on 2018/4/3.
 *
 * 远程回掉接口的使用：生命接口aidl文件并声明回掉方法，这和普通远程接口的操作一样，
 *     回掉接口在其他接口方法中使用需要直接import进去。
 *     不同之处在于接下来的处理：回掉接口想要在client端使用，需要创建一个继承自回掉
 *     接口stub的空实现，然后把该类拷贝到客户端相同包目录下，客户端注册接口时候直接
 *     实现该类即可；
 */

public class ICallbackApi extends IMyAidlCallback.Stub{
    @Override
    public void onCallback(String str) throws RemoteException {

    }
}
