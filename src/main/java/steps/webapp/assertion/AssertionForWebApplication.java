package steps.webapp.assertion;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import pageobjects.webapp.GoogleResultSearchPage;
import setup.SetupTest;


public class AssertionForWebApplication extends SetupTest {

    private WebDriver driver;
    private SoftAssert softAssert;
    private GoogleResultSearchPage resultSearchPage;

    public AssertionForWebApplication(AppiumDriver appiumDriver,
                                      WebDriverWait webDriverWait, SoftAssert softAssert) {
        driver = appiumDriver;
        this.softAssert = softAssert;
        resultSearchPage = new GoogleResultSearchPage(appiumDriver, webDriverWait);
    }

    public void checkThatGoogleHomePageWasOpened(String expectedGoogleHomePageTitle) {
        String actual = driver.getTitle();
        softAssert.assertTrue(actual.equals(expectedGoogleHomePageTitle),
                "The title of the Google Home page of the web "
                        + "application isn't matched with the expected result");
    }

    public void checkOpenedGoogleResultSearchPage() {
        resultSearchPage.checkOpenedGoogleResultSearchPage();
    }

    public void checkThatRelevantResultsNan() {
        if (resultSearchPage.getRelevantResults() != null) {
            System.out.println("\n>->-> The result isn't equal null <-<-<\n"
                    + "The assertion of web app passed successfully");
        } else {
            System.out.println("\n>!>!> The result is equal null <!<!< \n"
                    + "The assertion of web app didn't pass\n");
        }
    }
}