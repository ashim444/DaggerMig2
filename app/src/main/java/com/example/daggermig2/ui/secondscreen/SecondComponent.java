package com.example.daggermig2.ui.secondscreen;

import com.example.daggermig2.di.ScreenScope;

import dagger.Subcomponent;

@ScreenScope
@Subcomponent
public interface SecondComponent {

    void inject(SecondController controller);

    @Subcomponent.Factory
    interface Factory {
        SecondComponent create();
    }

}
