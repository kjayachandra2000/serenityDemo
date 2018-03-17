package com.test.serenityDemo.support;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class DriverManager implements DriverSource {
    @Override
    public WebDriver newDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeDriver driver = null;
        try {
            Thread.sleep(500);

            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--start-maximized");
            options.addArguments("disable-extensions");
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
