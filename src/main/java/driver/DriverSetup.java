package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {

    protected AndroidDriver androidDriver;

    protected void prepareAndroidNative() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        // mandatory Android capabilities
        desiredCapabilities.setCapability("deviceName", "400bfcaa");
        desiredCapabilities.setCapability("platformName", "Android");

        //path to app
        //copy the application (.apk), which will become AUT, to the specified location, e.g. "resources" folder of the project
        File applicationDirectory = new File("src/main/resources/");
        File EPAMTestApp = new File(applicationDirectory, "EPAMTestApp.apk");

        //other capability
        desiredCapabilities.setCapability("EPAMTestApp", EPAMTestApp.getAbsolutePath());

        //init driver for local Appium server with capabilities have been set
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }
}