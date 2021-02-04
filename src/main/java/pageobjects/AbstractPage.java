package pageobjects;

import org.openqa.selenium.WebElement;

public interface AbstractPage {
    WebElement waitUntilExpectedWebElementVisible(
                                WebElement webElementThatShouldBeWaited);
}
