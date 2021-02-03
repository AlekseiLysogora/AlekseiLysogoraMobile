package pageobjects.webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AbstractPage;

public class CoreWebPage extends AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public CoreWebPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    @Override
    protected WebElement waitUntilExpectedWebElementVisible(
                                        WebElement webElementThatShouldBeWaited) {
        wait.until(ExpectedConditions.visibilityOf(webElementThatShouldBeWaited));
        return webElementThatShouldBeWaited;
    }
}
