package com.rcmapps.viperonandroid.di;

import android.content.Context;

import com.rcmapps.viperonandroid.repository.SharedPreferenceRepo;
import com.rcmapps.viperonandroid.repository.impls.SharedPreferenceRepoImpl;

public class AppModuleImpl implements AppModule {

    private final SharedPreferenceRepoImpl sharedPreferenceRepo;

    public AppModuleImpl(Context context) {
        sharedPreferenceRepo = new SharedPreferenceRepoImpl(context);
    }

    @Override
    public SharedPreferenceRepo getSharedPrefRepo() {
        return sharedPreferenceRepo;
    }
}
