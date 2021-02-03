package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AbstractPage;

public class CoreNativePage extends AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected static final String APP_PACKAGE_NAME = "platkovsky.alexey.epamtestapp:id/";
    protected static final String CLICK_ON_CHECKBOX = "/hierarchy/android.widget."
            + "FrameLayout/android.widget"
            + ".LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
            + ".FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget"
            + ".LinearLayout/android.widget.CheckedTextView";

    public CoreNativePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, 5);
    }

    @Override
    protected WebElement waitUntilExpectedWebElementVisible(
                                        WebElement webElementThatShouldBeWaited) {
        wait.until(ExpectedConditions.visibilityOf(webElementThatShouldBeWaited));
        return webElementThatShouldBeWaited;
    }
}