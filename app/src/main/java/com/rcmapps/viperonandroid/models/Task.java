package com.rcmapps.viperonandroid.models;

import java.io.Serializable;

//TODO: replace serializable with Perceler (https://github.com/johncarl81/parceler)
public class Task  implements Serializable{

    private long id;
    private String taskDescription;

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

}
