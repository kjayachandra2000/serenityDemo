package com.test.serenityDemo.spec;

import com.test.serenityDemo.step.LoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public abstract class BaseSpec {

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;


}
