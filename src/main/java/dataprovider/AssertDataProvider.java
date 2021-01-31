package dataprovider;

import org.testng.annotations.DataProvider;
import utility.GetProperties;


import java.util.Random;

import static utility.GetProperties.NameOfProperty.TEST_DATA;

public class AssertDataProvider {

    private GetProperties getTestDataProperty = new GetProperties(TEST_DATA);

    Random r = new Random();
    int randomInt = r.nextInt(10000) + 1;

    public String expectedHomePageTitle = getTestDataProperty.getResource("expectedHomePageTitle");
    public String expectedRegistrationPage = getTestDataProperty.getResource("expectedHomePageTitle");
    public String expectedBudgetPage = getTestDataProperty.getResource("expectedHomePageTitle");

    public String newEmail = randomInt + getTestDataProperty.getResource("newEmail");
    public String newUsername = randomInt + getTestDataProperty.getResource("newUsername");
    //password length should be between 8 and 20 symbols
    public String newPassword = randomInt + getTestDataProperty.getResource("newPassword");


    @DataProvider(name = "assertDataNativeApplication")
    public Object[][] assertTextDataSet() {
        return new Object[][]{
                {expectedHomePageTitle, expectedRegistrationPage, expectedBudgetPage,
                 newEmail, newUsername, newPassword}
        };
    }

}
