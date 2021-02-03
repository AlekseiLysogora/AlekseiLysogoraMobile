package dataprovider;

import org.testng.annotations.DataProvider;
import utility.GetProperties;

import java.util.Random;

import static utility.GetProperties.NameOfProperty.*;

public class DataProviderForTests {

    private GetProperties getNativeAppProperty = new GetProperties(NATIVE_APP);
    private GetProperties getWebAppProperty = new GetProperties(WEB_APP);

    Random random = new Random();
    int randomInt = random.nextInt(10000) + 1;

    public String expectedHomePageTitle = getNativeAppProperty
            .getResource("expectedHomePageTitle");
    public String expectedRegistrationPage = getNativeAppProperty
            .getResource("expectedRegistrationPage");
    public String expectedBudgetPage = getNativeAppProperty
            .getResource("expectedBudgetPage");

    public String newEmail = randomInt + getNativeAppProperty
            .getResource("newEmail");
    public String newUsername = randomInt + getNativeAppProperty
            .getResource("newUsername");
    //password length should be between 8 and 20 symbols
    public String newPassword = randomInt + getNativeAppProperty
            .getResource("newPassword");

    public String googleHomePagePath = getWebAppProperty
            .getResource("googleHomePagePath");
    public String googleHomePageTitle = getWebAppProperty
            .getResource("expectedGoogleHomePageTitle");
    public String searchingWord = getWebAppProperty
            .getResource("searchingWord");


    @DataProvider(name = "assertDataNativeApplication")
    public Object[][] assertTextDataSet() {
        return new Object[][]{
                {expectedHomePageTitle, expectedRegistrationPage, expectedBudgetPage,
                 newEmail, newUsername, newPassword}
        };
    }

    @DataProvider(name = "dataWebApplication")
    public Object[][] dataWebApplication() {
        return new Object[][]{
                {googleHomePagePath, googleHomePageTitle, searchingWord}
        };
    }

}
