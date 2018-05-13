package com.rcmapps.viperonandroid.di;

import com.rcmapps.viperonandroid.repository.SharedPreferenceRepo;

public interface AppModule {
    SharedPreferenceRepo getSharedPrefRepo();
}
