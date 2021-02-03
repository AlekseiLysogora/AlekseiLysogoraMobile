package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleHomePage extends CoreWebPage {

    @FindBy(xpath = ("//input[@name='q']"))
    WebElement searchTextField;

    public GoogleHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(appiumDriver, this);
    }

    public void openGooglePage(String addressOfGooglePage) {

        driver.get(addressOfGooglePage); // openGoogle search page

        // Make sure that page has been loaded completely
        wait.until(
                wd -> ((JavascriptExecutor) wd)
                        .executeScript("return document.readyState").equals("complete")
        );
    }

    public void fillSearchTextFieldByRequestWord(String searchingWord) {
        waitUntilExpectedWebElementVisible(searchTextField).sendKeys(searchingWord);
        searchTextField.sendKeys(Keys.ENTER);
    }
}