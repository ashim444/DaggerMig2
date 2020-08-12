package com.example.daggermig2.navigator;

import com.bluelinelabs.conductor.Router;

public interface Navigator {

    void navigateToInitialScreen(Router router);

    void navigateToSecondScreen();

    boolean pop();
}
