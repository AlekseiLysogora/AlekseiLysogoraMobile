package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends CoreWebPage {

    @FindBy(xpath = ("//input[@name='q']"))
    WebElement searchTextField;

    private WebDriverWait wait;

    public GoogleHomePage(AppiumDriver appiumDriver, WebDriverWait wait) {
        super(appiumDriver);
        this.wait = wait;
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
        searchTextField.sendKeys(searchingWord);
    }
}