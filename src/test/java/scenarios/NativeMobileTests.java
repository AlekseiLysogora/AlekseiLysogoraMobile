package scenarios;

import dataprovider.AssertDataProvider;
import org.testng.annotations.Test;
import setup.BaseTest;

public class NativeMobileTests extends BaseTest {

    @Test(
            groups = {"native"},
            description = "Register a new account and then sign in",
            dataProvider = "assertDataNativeApplication",
            dataProviderClass = AssertDataProvider.class
    )
    public void simpleNativeTest(
            String expectedHomePageTitle, String expectedRegistrationPage,
            String expectedBudgetPage, String email, String username, String password) {

        step.openHomePageAndClickRegistrationBtn();
        /*assertionStep.checkThatHomePageWasOpened(
                getDriver().findElement(By.xpath("/hierarchy/android.widget
                .FrameLayout/android.widget
                .LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget
                .FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                .getText(), expectedHomePageTitle
        );*/
        step.fillEmailTextFieldByNewEmail(email);
        step.fillUsernameTextFieldByNewUsername(username);
        step.fillPasswordTextFieldByNewPassword(password);
        step.fillConfirmPasswordTextFieldByNewPassword(password);
        step.clickOnCheckBox(); // <<---??
        step.clickOnRegistrationButton();
        /*assertionStep.checkThatRegistrationPageWasOpened(
                getDriver().findElement(By.xpath("/hierarchy/android.widget
                .FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view
                .ViewGroup/android.widget.FrameLayout[1]/android.view
                .ViewGroup/android.widget.TextView"))
                .getText(), expectedRegistrationPage
        );*/
        step.fillEmailTextFieldByCreatedEmail(email);
        step.fillPasswordTextFieldByCreatedPassword(password);
        step.clickOnSignInButton();
        /*assertionStep.checkThatBudgetPageWasOpened(
                getDriver().findElement(By.xpath("/hierarchy/android.widget
                .FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view
                .ViewGroup/android.widget.FrameLayout[2]/android.view
                .ViewGroup/android.widget.TextView"))
                .getText(), expectedBudgetPage
        );*/
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Simplest Android native test done");
    }

}
