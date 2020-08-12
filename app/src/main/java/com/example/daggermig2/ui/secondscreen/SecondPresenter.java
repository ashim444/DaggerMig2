package com.example.daggermig2.ui.secondscreen;

import android.util.Log;

import com.example.daggermig2.di.ScreenScope;
import com.example.daggermig2.navigator.Navigator;
import com.example.daggermig2.storage.UserStorage;

import javax.inject.Inject;

@ScreenScope
public class SecondPresenter {
    private static final String TAG = "FirstPresenter";
    private final Navigator navigator;
    private final UserStorage storage;

    @Inject
    public SecondPresenter(Navigator navigator, UserStorage storage) {
        this.navigator = navigator;
        this.storage = storage;
    }

    public void printLog() {
        Log.d(TAG, "printLog: navigator" + navigator);
        Log.d(TAG, "printLog: storage" + storage);
    }

    public void navigateBack() {
        navigator.pop();
    }
}
