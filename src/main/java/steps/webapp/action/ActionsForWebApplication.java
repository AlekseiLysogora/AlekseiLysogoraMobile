package steps.webapp.action;

import io.appium.java_client.AppiumDriver;
import pageobjects.webapp.GoogleHomePage;

public class ActionsForWebApplication {

    private GoogleHomePage googleHomePage;

    public ActionsForWebApplication(AppiumDriver appiumDriver) {
        googleHomePage = new GoogleHomePage(appiumDriver);
    }

    public void openGoogleHomePage(String addressOfGooglePage) {
        googleHomePage.openGooglePage(addressOfGooglePage);
    }

    public void fillSearchTextFieldByRequestWord(String searchingWord) {
        googleHomePage.fillSearchTextFieldByRequestWord(searchingWord);
    }
}
