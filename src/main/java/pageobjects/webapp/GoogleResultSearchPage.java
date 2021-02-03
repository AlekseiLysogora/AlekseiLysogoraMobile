package pageobjects.webapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultSearchPage extends CoreWebPage {

    @FindBy(xpath = ("//*[@id='rso']/div"))
    List<WebElement> resultSearchList;

    public GoogleResultSearchPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(appiumDriver, this);
    }

    public void checkOpenedGoogleResultSearchPage() {

        // Make sure that page has been loaded completely
        wait.until(
                wd -> ((JavascriptExecutor) wd)
                        .executeScript("return document.readyState").equals("complete")
        );
    }

    public List<WebElement> getRelevantResults() {
        return resultSearchList;
    }
}
