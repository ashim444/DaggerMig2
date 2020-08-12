package com.example.daggermig2.storage;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LocalSharedPref implements UserStorage {

    private final Context context;

    @Inject
    public LocalSharedPref(Context context) {
        this.context = context;
    }

    @Override
    public void saveString(String value, String key) {

    }

    @Override
    public void getString(String key) {

    }
}
