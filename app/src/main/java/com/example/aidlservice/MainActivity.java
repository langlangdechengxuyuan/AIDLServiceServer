package com.example.aidlservice;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 进程需要将其对象分解成操作系统能够识别的原语，并将对象编组成跨越边界的对象。
 * 注：只有允许不同应用的客户端用 IPC 方式访问服务，并且想要在服务中处理多线程时，才有必要使用 AIDL。
 * 如果您不需要执行跨越不同应用的并发 IPC，就应该通过实现一个 Binder 创建接口；
 * 或者，如果您想执行 IPC，但根本不需要处理多线程，则使用 Messenger 类来实现接口。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parcelable parcelable;
    }
}
