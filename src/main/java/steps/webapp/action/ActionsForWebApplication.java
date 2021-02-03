package steps.webapp.action;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.webapp.GoogleHomePage;

public class ActionsForWebApplication {

    private GoogleHomePage googleHomePage;

    public ActionsForWebApplication(AppiumDriver appiumDriver, WebDriverWait wait) {
        googleHomePage = new GoogleHomePage(appiumDriver, wait);
    }

    public void openGoogleHomePage(String addressOfGooglePage) {
        googleHomePage.openGooglePage(addressOfGooglePage);
    }

    public void fillSearchTextFieldByRequestWord(String searchingWord) {
        googleHomePage.fillSearchTextFieldByRequestWord(searchingWord);
    }
}
