package pageobjects.webapp.pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.webapp.CoreWebPage;

import java.util.List;

public class GoogleResultSearchPage extends CoreWebPage {

    @FindBy(xpath = ("//*[@id='rso']/div"))
    List<WebElement> resultSearchList;

    private WebDriverWait webDriverWait;

    public GoogleResultSearchPage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver, webDriverWait);
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(appiumDriver, this);
    }

    public void checkOpenedGoogleResultSearchPage() {

        // Make sure that page has been loaded completely
        webDriverWait.until(
                wd -> ((JavascriptExecutor) wd)
                        .executeScript("return document.readyState").equals("complete")
        );
    }

    public List<WebElement> getRelevantResults() {
        return resultSearchList;
    }
}
