package steps.assertion;

import io.appium.java_client.AppiumDriver;
import org.testng.asserts.SoftAssert;
import pageobjects.nativeapp.NativeHomePage;
import pageobjects.nativeapp.RegistrationPage;

public class AssertionForNativeApplication {

    private NativeHomePage nativeHomePage;
    private RegistrationPage registrationPage;
    private SoftAssert softAssert;

    public AssertionForNativeApplication(AppiumDriver appiumDriver, SoftAssert softAssert) {
        nativeHomePage = new NativeHomePage(appiumDriver);
        registrationPage = new RegistrationPage(appiumDriver);
        this.softAssert = softAssert;
    }

    public void checkThatHomePageWasOpened(String actual, String expected) {
        softAssert.assertTrue(actual.equals(expected),
                "The title of the Home page of the native "
                        + "application isn't matched with the expected result");
    }

    public void checkThatRegistrationPageWasOpened(String actual, String expectedRegistrationPage) {
        softAssert.assertTrue(actual.equals(expectedRegistrationPage),
                "The title of the Registration Page of the native "
                        + "application isn't matched with the expected result");
    }

    public void checkThatBudgetPageWasOpened(String actual, String expectedBudgetPage) {
        softAssert.assertTrue(actual.equals(expectedBudgetPage),
                "The title of the Budget Page of the native "
                        + "application isn't matched with the expected result");
    }
}
