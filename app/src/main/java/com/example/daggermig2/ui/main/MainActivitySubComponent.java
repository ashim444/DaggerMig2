package com.example.daggermig2.ui.main;

import com.example.daggermig2.ui.firstscreen.FirstComponent;
import com.example.daggermig2.ui.secondscreen.SecondComponent;

import dagger.Module;

@Module(
        subcomponents = {
                FirstComponent.class,
                SecondComponent.class
        }
)
public class MainActivitySubComponent {
}
