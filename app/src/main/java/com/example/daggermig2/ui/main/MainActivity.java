package com.example.daggermig2.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.example.daggermig2.MyApplication;
import com.example.daggermig2.R;
import com.example.daggermig2.navigator.Navigator;
import com.example.daggermig2.storage.UserStorage;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    UserStorage storage;

    @Inject
    Navigator navigator;
    MainActivityComponent component;
    private Router router;

    public MainActivityComponent getComponent() {
        return component;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        component = ((MyApplication) getApplication()).getAppComponent().getActivityComponent().create();
        component.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup viewRoot = findViewById(R.id.root_view);
        router = Conductor.attachRouter(this, viewRoot, savedInstanceState);
        navigator.navigateToInitialScreen(router);
        Log.d(TAG, "onCreate: storage" + storage);
        Log.d(TAG, "onCreate: navigator" + navigator);
    }

    @Override
    public void onBackPressed() {
        if (!navigator.pop()) {
            super.onBackPressed();
        }
    }
}
