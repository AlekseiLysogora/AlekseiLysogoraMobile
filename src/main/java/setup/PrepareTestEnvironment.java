package setup;

import java.io.File;
import java.net.*;
import java.util.concurrent.TimeUnit;

import driver.IDriver;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class PrepareTestEnvironment implements IDriver {

    private static AppiumDriver appiumDriver; // singleton
    protected WebDriverWait webDriverWait;

    @Override
    public AppiumDriver getDriver() {
        return appiumDriver;
    }

    @Parameters({"platformName","appType","deviceName","browserName","app", "bundleId"})
    @BeforeSuite(alwaysRun = true)
    public void setUp(
            String platformName,
            String appType,
            String deviceName,
            @Optional("") String browserName,
            @Optional("") String app,
            @Optional("") String bundleId) {

        System.out.println("Before: app type - " + appType);
        setAppiumDriver(platformName, deviceName, browserName, app, bundleId);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Suite");
        appiumDriver.closeApp();
    }

    private void setAppiumDriver(
            String platformName, String deviceName,
            String browserName, String app, String bundleId) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //mandatory Android capabilities
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("deviceName",deviceName);

        if (app.endsWith(".apk")) {
            capabilities.setCapability("app", (new File(app)).getAbsolutePath());
        }

        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("chromedriverDisableBuildCheck","true");

        // Capabilities for test of iOS native app on EPAM Mobile Cloud
        capabilities.setCapability("bundleId",bundleId);

        try {
            appiumDriver = new AppiumDriver(new URL(System.getProperty("ts.appium")), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Timeouts tuning
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}