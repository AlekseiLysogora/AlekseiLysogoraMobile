package coretest;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import setup.*;

import steps.nativeapp.action.ActionsForNativeApplication;
import steps.nativeapp.assertion.AssertionForNativeApplication;
import steps.webapp.action.ActionsForWebApplication;
import steps.webapp.assertion.AssertionForWebApplication;

public abstract class InitializationTest extends PrepareTestEnvironment {

    protected AppiumDriver driver;
    protected SoftAssert softAssertion;

    protected ActionsForNativeApplication stepNativeApp;
    protected AssertionForNativeApplication assertionStepNativeApp;

    protected ActionsForWebApplication stepWebApp;
    protected AssertionForWebApplication assertionStepWebApp;

    @BeforeMethod(
            alwaysRun = true,
            description = "This method has the purpose to initialize the test's core classes")
    public void initializationTestCore() {
        driver =  getDriver();
        webDriverWait = new WebDriverWait(driver, 10);
        softAssertion = new SoftAssert();

        stepNativeApp = new ActionsForNativeApplication(driver, webDriverWait);
        assertionStepNativeApp = new AssertionForNativeApplication(driver, webDriverWait,
                                                                           softAssertion);

        stepWebApp = new ActionsForWebApplication(driver, webDriverWait);
        assertionStepWebApp = new AssertionForWebApplication(driver, webDriverWait,
                                                                     softAssertion);
    }
}