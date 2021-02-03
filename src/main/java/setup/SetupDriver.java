package setup;

import java.io.File;
import java.net.*;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import pageobjects.PageObject;

public class SetupDriver implements IDriver {

    private static AppiumDriver appiumDriver; // singleton
    IPageObject pageObject;

    @Override
    public AppiumDriver getDriver() {
        return appiumDriver;
    }

    @Parameters({"platformName","appType","deviceName","browserName","app"})
    @BeforeSuite(alwaysRun = true)
    public void setUp(
            String platformName, String appType, String deviceName,
            @Optional("") String browserName, @Optional("") String app) throws Exception {

        System.out.println("Before: app type - " + appType);
        setAppiumDriver(platformName, deviceName, browserName, app);
        setPageObject(appType, appiumDriver);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Suite");
        appiumDriver.closeApp();
    }

    private void setAppiumDriver(
            String platformName, String deviceName, String browserName, String app) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //mandatory Android capabilities
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("deviceName",deviceName);

        if (app.endsWith(".apk")) {
            capabilities.setCapability("app", (new File(app)).getAbsolutePath());
        }

        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("chromedriverDisableBuildCheck","true");

        try {
            appiumDriver = new AppiumDriver(new URL(System.getProperty("ts.appium")), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Timeouts tuning
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    private void setPageObject(String appType, AppiumDriver appiumDriver) throws Exception {
        pageObject = new PageObject(appType, appiumDriver);
    }
}