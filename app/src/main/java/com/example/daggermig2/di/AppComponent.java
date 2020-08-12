package com.example.daggermig2.di;

import android.content.Context;

import com.example.daggermig2.storage.StorageModule;
import com.example.daggermig2.ui.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(
        modules = {
                StorageModule.class, AppSubComponents.class
        }
)
public interface AppComponent {

    MainActivityComponent.Factory getActivityComponent();

    @Component.Factory
    interface Factory {
        AppComponent create(@BindsInstance Context context);
    }
}
