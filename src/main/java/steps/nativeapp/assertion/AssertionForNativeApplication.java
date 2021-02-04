package steps.nativeapp.assertion;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import pageobjects.nativeapp.BudgetPage;

import pageobjects.nativeapp.NativeHomePage;
import setup.SetupTest;

public class AssertionForNativeApplication extends SetupTest {

    private WebDriver driver;
    private NativeHomePage nativeHomePage;
    private BudgetPage budgetPage;
    private SoftAssert softAssert;

    public AssertionForNativeApplication(AppiumDriver appiumDriver,
                                         WebDriverWait webDriverWait, SoftAssert softAssert) {
        driver = appiumDriver;
        this.softAssert = softAssert;
        nativeHomePage = new NativeHomePage(appiumDriver, webDriverWait);
        budgetPage = new BudgetPage(appiumDriver, webDriverWait);
    }

    public void checkThatHomePageWasOpened() {
        softAssert.assertTrue(nativeHomePage.getLoginForm().isDisplayed(),
                "The login form on the Home page of Native application isn't exists");
    }

    public void checkThatBudgetPageWasOpened(String expectedBudgetPage) {
        String actual = budgetPage.getActivityTitle();

        softAssert.assertTrue(actual.equals(expectedBudgetPage),
                "The title of the Budget Page of the native "
                        + "application isn't matched with the expected result");
    }
}