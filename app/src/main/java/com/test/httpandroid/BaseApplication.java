package com.test.httpandroid;

import android.app.Application;
import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by 腾翔信息 on 2018/3/19.
 */

public class BaseApplication extends Application {
    private Retrofit retrofit;
    private Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
