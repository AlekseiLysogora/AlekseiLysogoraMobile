package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class DriverNativeApplication {

    protected WebDriver driver;

    public DriverNativeApplication(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }
}
