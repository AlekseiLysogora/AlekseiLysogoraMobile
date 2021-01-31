package scenarios;

import driver.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSimpleTest extends DriverSetup {
    //Prepare driver to run test(s)
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidNative();
    }

    //just click on button 'Register new user'
    @Test
    public void simpleTest() {
        String appPackageName = "platkovsky.alexey.epamtestapp:id/";
        By registerButton = By.id(appPackageName + "register_button");
        androidDriver.findElement(registerButton).click();
        System.out.println("Simple Appium test done");
    }

    //close driver on all test completion
    @AfterClass
    public void tearDown() throws Exception {
        //androidDriver.closeApp();
        androidDriver.quit();
    }
}
