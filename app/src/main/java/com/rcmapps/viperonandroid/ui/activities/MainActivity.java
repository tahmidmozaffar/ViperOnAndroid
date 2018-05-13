package com.rcmapps.viperonandroid.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.rcmapps.viperonandroid.R;
import com.rcmapps.viperonandroid.contracts.MainContracts;
import com.rcmapps.viperonandroid.models.Task;
import com.rcmapps.viperonandroid.presenters.MainPresenter;
import com.rcmapps.viperonandroid.ui.ApplicationModule;
import com.rcmapps.viperonandroid.ui.routers.MainRouter;

public class MainActivity extends AppCompatActivity implements MainContracts.View {

    private MainPresenter presenter;
    private EditText taskEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taskEditText = findViewById(R.id.editText);

        presenter = new MainPresenter(this, new MainRouter(this), ((ApplicationModule) getApplication()).getAppModule());

    }

    @Override
    public void showError(String message) {
        //show alert or toast
    }

    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            presenter.addTask(new Task(taskEditText.getText().toString()));
        }
    }

}
