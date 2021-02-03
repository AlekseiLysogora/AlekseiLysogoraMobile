package coretest;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.*;
import org.testng.ITestContext;
import org.testng.asserts.SoftAssert;

import pageobjects.nativeapp.*;
import pageobjects.webapp.GoogleHomePage;

import setup.SetupDriver;

import steps.nativeapp.action.ActionsForNativeApplication;
import steps.nativeapp.assertion.AssertionForNativeApplication;
import steps.webapp.action.ActionsForWebApplication;
import steps.webapp.assertion.AssertionForWebApplication;

public abstract class CoreTest extends SetupDriver {

    protected AppiumDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert softAssertion;

    protected GoogleHomePage homePage;
    protected NativeHomePage nativeHomePage;
    protected RegistrationPage registrationPage;

    protected ActionsForNativeApplication stepNativeApp;
    protected AssertionForNativeApplication assertionStepNativeApp;

    protected ActionsForWebApplication stepWebApp;
    protected AssertionForWebApplication assertionStepWebApp;

    @BeforeMethod(
            alwaysRun = true,
            description = "This method has the purpose to initialize the test's core classes")
    public void initializationTestCore(ITestContext testContext) {
        driver =  getDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();

        stepNativeApp = new ActionsForNativeApplication(driver, wait);
        assertionStepNativeApp = new AssertionForNativeApplication(driver, softAssertion, nativeHomePage, registrationPage);

        stepWebApp = new ActionsForWebApplication(driver, wait);
        assertionStepWebApp = new AssertionForWebApplication(driver, softAssertion, homePage);
    }
}