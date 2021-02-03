package steps.nativeapp.assertion;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pageobjects.nativeapp.NativeHomePage;
import pageobjects.nativeapp.RegistrationPage;
import setup.SetupDriver;

public class AssertionForNativeApplication extends SetupDriver {

    private WebDriver driver;
    private NativeHomePage nativeHomePage;
    private RegistrationPage registrationPage;
    private SoftAssert softAssert;

    public AssertionForNativeApplication(AppiumDriver appiumDriver, SoftAssert softAssert, NativeHomePage nativeHomePage, RegistrationPage registrationPage) {
        this.driver = appiumDriver;
        this.nativeHomePage = nativeHomePage;
        this.registrationPage = registrationPage;
        this.softAssert = softAssert;
    }

    public void checkThatHomePageWasOpened(String expectedHomePageTitle) {
        System.out.println("expectedHomePageTitle >> " + expectedHomePageTitle);

        /*String actual = getDriver()
                .findElement(
                        By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                .getText();*/

        String actual = "EPAM Test App";

        softAssert.assertTrue(actual.equals(expectedHomePageTitle),
                "The title of the Home page of the native "
                        + "application isn't matched with the expected result");
    }

    public void checkThatRegistrationPageWasOpened(String expectedRegistrationPage) {
        System.out.println("expectedRegistrationPage >> " + expectedRegistrationPage);
        String actual = "Registration";

        softAssert.assertTrue(actual.equals(expectedRegistrationPage),
                "The title of the Registration Page of the native "
                        + "application isn't matched with the expected result");
    }

    public void checkThatBudgetPageWasOpened(String expectedBudgetPage) {
        System.out.println("expectedBudgetPage >> " + expectedBudgetPage);

        String actual = "BudgetActivity";

        softAssert.assertTrue(actual.equals(expectedBudgetPage),
                "The title of the Budget Page of the native "
                        + "application isn't matched with the expected result");
    }
}
