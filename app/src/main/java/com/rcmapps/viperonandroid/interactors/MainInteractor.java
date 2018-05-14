package com.rcmapps.viperonandroid.interactors;

import com.rcmapps.viperonandroid.contracts.MainContracts;
import com.rcmapps.viperonandroid.models.Task;
import com.rcmapps.viperonandroid.repository.SharedPreferenceRepo;

public class MainInteractor implements MainContracts.Interactor{

    private MainContracts.InteractionOutput output;
    private SharedPreferenceRepo sharedPreferenceRepo;

    public MainInteractor(MainContracts.InteractionOutput output, SharedPreferenceRepo sharedPreferenceRepo) {

        this.output = output;
        this.sharedPreferenceRepo = sharedPreferenceRepo;
    }

    @Override
    public void saveTask(Task task) {

        int result =  sharedPreferenceRepo.saveTask(task);

        if(result>0){
            output.onSuccess(task);
        }
        else{
            output.onFailure("saving item was failed");
        }
    }

}
