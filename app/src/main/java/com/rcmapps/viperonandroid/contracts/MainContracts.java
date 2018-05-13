package com.rcmapps.viperonandroid.contracts;

import com.rcmapps.viperonandroid.models.Task;

public class MainContracts {

    public interface View {
        void showError(String message);
    }

    public interface Interactor {
        void saveTask(Task task);
    }

    public  interface InteractionOutput {
        void onSuccess(Task task);

        void onFailure(String errorMessage);

    }

    public  interface Router {
        void showTaskDetails(Task task);
    }
}
