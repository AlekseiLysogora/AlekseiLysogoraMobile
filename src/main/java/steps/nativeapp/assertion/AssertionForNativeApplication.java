package steps.nativeapp.assertion;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import pageobjects.nativeapp.BudgetPage;

import setup.SetupDriver;

public class AssertionForNativeApplication extends SetupDriver {

    private WebDriver driver;
    private BudgetPage budgetPage;
    private SoftAssert softAssert;

    public AssertionForNativeApplication(AppiumDriver appiumDriver, SoftAssert softAssert) {
        driver = appiumDriver;
        this.budgetPage = new BudgetPage(appiumDriver);
        this.softAssert = softAssert;
    }

    public void checkThatBudgetPageWasOpened(String expectedBudgetPage) {
        String actual = budgetPage.getActivityTitle();

        //System.out.println("actual BudgetPageTitle >> " + actual);
        //System.out.println("expected BudgetPageTitle >> " + expectedBudgetPage);

        softAssert.assertTrue(actual.equals(expectedBudgetPage),
                "The title of the Budget Page of the native "
                        + "application isn't matched with the expected result");
    }
}