package com.rcmapps.viperonandroid.ui;

import android.app.Application;

import com.rcmapps.viperonandroid.di.AppModule;
import com.rcmapps.viperonandroid.di.AppModuleImpl;


public class ApplicationModule extends Application {

    private AppModule appModule;
    @Override
    public void onCreate() {
        super.onCreate();

         appModule = new AppModuleImpl(this);
    }

    public AppModule getAppModule() {
        return appModule;
    }
}
