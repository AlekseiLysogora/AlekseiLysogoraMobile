package steps.action;

import io.appium.java_client.AppiumDriver;
import pageobjects.nativeapp.NativeHomePage;
import pageobjects.nativeapp.RegistrationPage;

public class ActionsForNativeApplication {

    private NativeHomePage nativeHomePage;
    private RegistrationPage registrationPage;

    public ActionsForNativeApplication(AppiumDriver appiumDriver) {
        nativeHomePage = new NativeHomePage(appiumDriver);
        registrationPage = new RegistrationPage(appiumDriver);
    }

    public void openHomePageAndClickRegistrationBtn() {
        nativeHomePage.openRegistrationPage();
    }

    public void fillEmailTextFieldByNewEmail(String newEmail) {
        registrationPage.setNewEmail(newEmail);
    }

    public void fillUsernameTextFieldByNewUsername(String newUsername) {
        registrationPage.setNewUsername(newUsername);
    }

    public void fillPasswordTextFieldByNewPassword(String newPassword) {
        registrationPage.setNewPassword(newPassword);
    }

    public void fillConfirmPasswordTextFieldByNewPassword(String confirmPassword) {
        registrationPage.confirmPasswordTextField(confirmPassword);
    }

    public void clickOnCheckBox() {
        registrationPage.clickOnCheckBox();
    }

    public void clickOnRegistrationButton() {
        registrationPage.clickOnRegistrationButton();
    }

    public void fillEmailTextFieldByCreatedEmail(String createdEmail) {
        nativeHomePage.fillEmailTextFieldByCreatedEmail(createdEmail);
    }

    public void fillPasswordTextFieldByCreatedPassword(String createdPassword) {
        nativeHomePage.fillPasswordTextFieldByCreatedPassword(createdPassword);
    }

    public void clickOnSignInButton() {
        nativeHomePage.clickOnSignInButton();
    }
}
