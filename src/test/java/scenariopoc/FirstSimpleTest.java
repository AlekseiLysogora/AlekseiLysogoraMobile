package scenariopoc;

import driverpoc.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSimpleTest extends DriverSetup {

    @BeforeClass(description = "Prepare driver to run test(s)")
    public void setUp() throws Exception {
        //prepareAndroidNative();
        prepareAndroidWeb();
    }

    //@Test(description = "Just click on button 'Register new user'")
    public void simpleAndroidNativeApplicationTest() {
        String appPackageName = "platkovsky.alexey.epamtestapp:id/";
        By registerButton = By.id(appPackageName + "register_button");
        androidDriver.findElement(registerButton).click();
        System.out.println("Simple Appium test done");
    }

    @Test(description = "Open Google website")
    public void simpleAndroidWebApplicationTest() throws InterruptedException {
        androidDriver.get("http://Google.com");
        Thread.sleep(5000);
        System.out.println("Site opening done");
    }

    @AfterClass(description = "Close driver on all test completion")
    public void tearDown() throws Exception {
        //androidDriver.closeApp();
        androidDriver.quit();
    }
}
