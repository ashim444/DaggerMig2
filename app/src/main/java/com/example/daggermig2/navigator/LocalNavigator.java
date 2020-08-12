package com.example.daggermig2.navigator;


import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.daggermig2.ui.firstscreen.FirstController;
import com.example.daggermig2.ui.secondscreen.SecondController;

import javax.inject.Inject;

public class LocalNavigator implements Navigator {

    private Router router;

    @Inject
    public LocalNavigator() {
    }

    @Override
    public void navigateToInitialScreen(Router router) {
        this.router = router;
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(FirstController.newInstance()));
        }
    }

    @Override
    public void navigateToSecondScreen() {
        router.pushController(RouterTransaction.with(SecondController.newInstance()));

    }

    @Override
    public boolean pop() {
        return router != null && router.handleBack();
    }
}
