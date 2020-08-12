package com.example.daggermig2.ui.firstscreen;

import com.example.daggermig2.di.ScreenScope;

import dagger.Subcomponent;

@ScreenScope
@Subcomponent
public interface FirstComponent {

    void inject(FirstController controller);

    @Subcomponent.Factory
    interface Factory {
        FirstComponent create();
    }
}
