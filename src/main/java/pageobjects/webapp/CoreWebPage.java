package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;

public class CoreWebPage {

    protected WebDriver driver;

    public CoreWebPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }
}
