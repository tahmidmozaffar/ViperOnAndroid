package com.rcmapps.viperonandroid.presenters;

import com.rcmapps.viperonandroid.contracts.MainContracts;
import com.rcmapps.viperonandroid.di.AppModule;
import com.rcmapps.viperonandroid.interactors.MainInteractor;
import com.rcmapps.viperonandroid.models.Task;

public class MainPresenter implements MainContracts.InteractionOutput{

    private final AppModule appModule;
    private final MainContracts.View view;
    private final MainContracts.Router router;

    private  final MainContracts.Interactor interactor;

    public MainPresenter(MainContracts.View view, MainContracts.Router router, AppModule appModule) {
        this.view = view;
        this.router = router;
        this.appModule = appModule;

        interactor = new MainInteractor(this,this.appModule.getSharedPrefRepo());
    }

    public void addTask(Task task){
        interactor.saveTask(task);
    }

    @Override
    public void onSuccess(Task task) {
        router.showTaskDetails(task);
    }

    @Override
    public void onFailure(String errorMessage) {
        view.showError(errorMessage);
    }
}
