package pageobjects.nativeapp;

import org.openqa.selenium.support.ui.WebDriverWait;
import setup.BaseTest;

public class CoreNativePage extends BaseTest {

    protected WebDriverWait wait = new WebDriverWait(getDriver(), 5);

    protected static final String APP_PACKAGE_NAME = "platkovsky.alexey.epamtestapp:id/";
    protected static final String CLICK_ON_CHECKBOX = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckedTextView";
}
