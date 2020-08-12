package com.example.daggermig2.storage;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class StorageModule {

    @Singleton
    @Binds
    abstract UserStorage provideUserStorage(LocalSharedPref sharedPref);
}
