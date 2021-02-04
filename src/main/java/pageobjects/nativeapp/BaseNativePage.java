package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AbstractPage;

public class BaseNativePage extends CoreNativePage implements AbstractPage {

    protected WebDriverWait wait;

    protected static final String APP_PACKAGE_NAME = "platkovsky.alexey.epamtestapp:id/";
    protected static final String CLICK_ON_CHECKBOX = "/hierarchy/android.widget."
            + "FrameLayout/android.widget"
            + ".LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
            + ".FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget"
            + ".LinearLayout/android.widget.CheckedTextView";

    public BaseNativePage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver);
        wait = webDriverWait;
    }

    @Override
    public WebElement waitUntilExpectedWebElementVisible(
                                        WebElement webElementThatShouldBeWaited) {
        wait.until(ExpectedConditions.visibilityOf(webElementThatShouldBeWaited));
        return webElementThatShouldBeWaited;
    }
}