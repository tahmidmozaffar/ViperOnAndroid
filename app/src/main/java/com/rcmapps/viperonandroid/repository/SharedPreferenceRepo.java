package com.rcmapps.viperonandroid.repository;

import com.rcmapps.viperonandroid.models.Task;

public interface SharedPreferenceRepo {
    int saveTask(Task task);
    void getTask(int id);
    void removeTask(int id);
    void getAllTasks();
}
