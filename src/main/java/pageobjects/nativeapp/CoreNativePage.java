package pageobjects.nativeapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.SetupDriver;

public class CoreNativePage extends SetupDriver {

    public WebDriver driver;

    protected WebDriverWait wait;

    protected static final String APP_PACKAGE_NAME = "platkovsky.alexey.epamtestapp:id/";
    protected static final String CLICK_ON_CHECKBOX = "/hierarchy/android.widget."
            + "FrameLayout/android.widget"
            + ".LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
            + ".FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget"
            + ".LinearLayout/android.widget.CheckedTextView";

    public CoreNativePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }
}