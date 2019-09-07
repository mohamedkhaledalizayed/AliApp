package com.example.aliapp;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitModule.intialize(this);
    }
}
