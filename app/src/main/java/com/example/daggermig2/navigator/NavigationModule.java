package com.example.daggermig2.navigator;

import com.example.daggermig2.di.ActivityScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class NavigationModule {

    @ActivityScope
    @Binds
    abstract Navigator bindLocalNavigator(LocalNavigator navigator);
}
