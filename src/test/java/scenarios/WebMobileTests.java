package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened Google search page")
    public void simpleWebTest() {
        getDriver().get("http://google.com"); // openGoogle search page

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd)
                        .executeScript("return document.readyState").equals("complete")
        );

        // Check Google search page  title
        assert ((WebDriver) getDriver())
                .getTitle()
                .equals("Google") : "This is not Google search page";

        // Log that test finished
        System.out.println("Site opening done");
    }

}
