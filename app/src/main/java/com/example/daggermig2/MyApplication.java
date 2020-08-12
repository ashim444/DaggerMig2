package com.example.daggermig2;

import android.app.Application;

import com.example.daggermig2.di.AppComponent;
import com.example.daggermig2.di.DaggerAppComponent;

public class MyApplication extends Application {

    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create(this);
    }
}
