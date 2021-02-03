package coretest;

import io.appium.java_client.AppiumDriver;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pageobjects.nativeapp.*;
import pageobjects.webapp.GoogleHomePage;

import setup.SetupDriver;

import steps.nativeapp.action.ActionsForNativeApplication;
import steps.nativeapp.assertion.AssertionForNativeApplication;
import steps.webapp.action.ActionsForWebApplication;
import steps.webapp.assertion.AssertionForWebApplication;

public abstract class InitializationTest extends SetupDriver {

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
        softAssertion = new SoftAssert();

        stepNativeApp = new ActionsForNativeApplication(driver);
        assertionStepNativeApp = new AssertionForNativeApplication(driver, softAssertion);

        stepWebApp = new ActionsForWebApplication(driver);
        assertionStepWebApp = new AssertionForWebApplication(driver, softAssertion);
    }
}