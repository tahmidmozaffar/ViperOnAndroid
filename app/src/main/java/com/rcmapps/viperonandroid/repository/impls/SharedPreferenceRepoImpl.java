package com.rcmapps.viperonandroid.repository.impls;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.rcmapps.viperonandroid.models.Task;
import com.rcmapps.viperonandroid.repository.SharedPreferenceRepo;

//TODO: this is temporary. data should be saved to a remote db repository thorugh api call
public class SharedPreferenceRepoImpl implements SharedPreferenceRepo {

    private final SharedPreferences sp;
    private SharedPreferences.Editor editor;
    public SharedPreferenceRepoImpl(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sp.edit();
    }

    @Override
    public void saveTask(Task task) {
        //save
    }

    @Override
    public void getTask(int id) {

    }

    @Override
    public void removeTask(int id) {

    }

    @Override
    public void getAllTasks() {

    }
}

