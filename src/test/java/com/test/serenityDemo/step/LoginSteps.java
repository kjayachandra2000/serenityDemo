package com.test.serenityDemo.step;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps {

    @Step
    public LoginSteps openApp() {
        homeScreen.open();
        return this;
    }

}
