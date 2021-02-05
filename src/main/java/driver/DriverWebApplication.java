package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;

public class DriverWebApplication {

    protected WebDriver driver;

    public DriverWebApplication(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }
}
