package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AbstractPage;

public class BaseWebPage extends CoreWebPage implements AbstractPage {

    protected WebDriverWait wait;

    public BaseWebPage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver);
        wait = webDriverWait;
    }

    @Override
    public WebElement waitUntilExpectedWebElementVisible(WebElement webElementThatShouldBeWaited) {
        wait.until(ExpectedConditions.visibilityOf(webElementThatShouldBeWaited));
        return webElementThatShouldBeWaited;
    }
}
