package com.rcmapps.viperonandroid.ui.routers;

import android.app.Activity;
import android.content.Intent;

import com.rcmapps.viperonandroid.contracts.MainContracts;
import com.rcmapps.viperonandroid.models.Task;
import com.rcmapps.viperonandroid.ui.activities.DetailActivity;

public class MainRouter implements MainContracts.Router {

    private Activity activity;

    public MainRouter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void showTaskDetails(Task task) {
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("task",task);
        activity.startActivity(intent);
    }
}
