package scenarios;

import coretest.CoreTest;
import dataprovider.DataProviderForTests;
import org.testng.annotations.Test;

public class NativeMobileTests extends CoreTest {

    @Test(
            groups = {"native"},
            description = "Register a new account and then sign in",
            dataProvider = "assertDataNativeApplication",
            dataProviderClass = DataProviderForTests.class
    )
    public void simpleNativeTest(
            String expectedHomePageTitle, String expectedRegistrationPage,
            String expectedBudgetPage, String email, String username, String password) {

        stepNativeApp.openHomePageAndClickRegistrationBtn();
        assertionStepNativeApp.checkThatHomePageWasOpened(expectedHomePageTitle);
        stepNativeApp.fillEmailTextFieldByNewEmail(email);
        stepNativeApp.fillUsernameTextFieldByNewUsername(username);
        stepNativeApp.fillPasswordTextFieldByNewPassword(password);
        stepNativeApp.fillConfirmPasswordTextFieldByNewPassword(password);
        stepNativeApp.clickOnCheckBox(); // <<---??
        stepNativeApp.clickOnRegistrationButton();
        assertionStepNativeApp.checkThatRegistrationPageWasOpened(expectedRegistrationPage);
        stepNativeApp.fillEmailTextFieldByCreatedEmail(email);
        stepNativeApp.fillPasswordTextFieldByCreatedPassword(password);
        stepNativeApp.clickOnSignInButton();
        assertionStepNativeApp.checkThatBudgetPageWasOpened(expectedBudgetPage);

        System.out.println("Simplest Android native test done");
    }

}
