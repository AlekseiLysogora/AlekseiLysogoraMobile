package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import pageobjects.AbstractPage;

public class CoreWebPage extends AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public CoreWebPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, 5);
    }

    @Override
    protected WebElement waitUntilExpectedWebElementVisible(
                                        WebElement webElementThatShouldBeWaited) {
        wait.until(ExpectedConditions.visibilityOf(webElementThatShouldBeWaited));
        return webElementThatShouldBeWaited;
    }
}
