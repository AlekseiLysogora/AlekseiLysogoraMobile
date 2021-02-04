package steps.webapp.action;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.webapp.GoogleHomePage;
import pageobjects.webapp.GoogleResultSearchPage;

public class ActionsForWebApplication {

    private GoogleHomePage googleHomePage;
    public GoogleResultSearchPage googleResultSearchPage;

    public ActionsForWebApplication(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        googleHomePage = new GoogleHomePage(appiumDriver, webDriverWait);
        googleResultSearchPage = new GoogleResultSearchPage(appiumDriver, webDriverWait);
    }

    public void openGoogleHomePage(String addressOfGooglePage) {
        googleHomePage.openGooglePage(addressOfGooglePage);
    }

    public void fillSearchTextFieldByRequestWord(String searchingWord) {
        googleHomePage.fillSearchTextFieldByRequestWord(searchingWord);
    }
}