package com.sun.networkretrofit;

import android.app.Application;

import com.sun.networkretrofit.http.HttpManager;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpManager.getInstance().init();
    }
}
