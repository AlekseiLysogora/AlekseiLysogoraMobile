package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BaseWebPage {

    @FindBy(xpath = ("//input[@name='q']"))
    WebElement searchTextField;

    private WebDriverWait webDriverWait;

    public GoogleHomePage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver, webDriverWait);
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(appiumDriver, this);
    }

    public void openGooglePage(String addressOfGooglePage) {

        driver.get(addressOfGooglePage); // openGoogle search page

        // Make sure that page has been loaded completely
        webDriverWait.until(
                wd -> ((JavascriptExecutor) wd)
                        .executeScript("return document.readyState").equals("complete")
        );
    }

    public void fillSearchTextFieldByRequestWord(String searchingWord) {
        waitUntilExpectedWebElementVisible(searchTextField).sendKeys(searchingWord);
        searchTextField.sendKeys(Keys.ENTER);
    }
}