package steps.webapp.assertion;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pageobjects.webapp.GoogleHomePage;
import setup.SetupDriver;

public class AssertionForWebApplication extends SetupDriver {

    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private SoftAssert softAssert;

    public AssertionForWebApplication(AppiumDriver appiumDriver, SoftAssert softAssert, GoogleHomePage googleHomePage) {
        driver = appiumDriver;
        this.softAssert = softAssert;
        this.googleHomePage = googleHomePage;
    }

    public void checkThatGoogleHomePageWasOpened(String expectedGoogleHomePageTitle) {
        String actual = driver.getTitle();
        softAssert.assertTrue(actual.equals(expectedGoogleHomePageTitle),
                "The title of the Google Home page of the web "
                        + "application isn't matched with the expected result");
    }
}