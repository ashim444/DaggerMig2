package com.example.daggermig2.ui.main;

import com.example.daggermig2.di.ActivityScope;
import com.example.daggermig2.navigator.NavigationModule;
import com.example.daggermig2.ui.firstscreen.FirstComponent;
import com.example.daggermig2.ui.secondscreen.SecondComponent;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules = {
                MainActivitySubComponent.class,
                NavigationModule.class
        }
)
public interface MainActivityComponent {

    void inject(MainActivity activity);

    FirstComponent.Factory getFirstComp();

    SecondComponent.Factory getSecondComp();

    @Subcomponent.Factory
    interface Factory {
        MainActivityComponent create();
    }
}
