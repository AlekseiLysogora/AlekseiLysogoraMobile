package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class CoreNativePage {

    protected WebDriver driver;

    public CoreNativePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }
}
