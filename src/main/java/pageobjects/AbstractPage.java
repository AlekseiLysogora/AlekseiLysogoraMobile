package pageobjects;

import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
    protected abstract WebElement waitUntilExpectedWebElementVisible(
                                WebElement webElementThatShouldBeWaited);
}
