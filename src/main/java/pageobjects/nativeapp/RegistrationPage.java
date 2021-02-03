package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends CoreNativePage {

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_email")
    WebElement emailTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_username")
    WebElement usernameTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_password")
    WebElement passwordTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_confirm_password")
    WebElement confirmPasswordTextField;

    @AndroidFindBy(xpath = CLICK_ON_CHECKBOX)
    WebElement clickOnCheckBox;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "register_new_account_button")
    WebElement registrationButton;

    public RegistrationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void setNewEmail(String newEmail) {
        waitUntilExpectedWebElementVisible(emailTextField).sendKeys(newEmail);
    }

    public void setNewUsername(String newUsername) {
        waitUntilExpectedWebElementVisible(usernameTextField).sendKeys(newUsername);
    }

    public void setNewPassword(String newPassword) {
        waitUntilExpectedWebElementVisible(passwordTextField).sendKeys(newPassword);
    }

    public void confirmPasswordTextField(String newPassword) {
        waitUntilExpectedWebElementVisible(confirmPasswordTextField).sendKeys(newPassword);
    }

    public void clickOnCheckBox() {
        waitUntilExpectedWebElementVisible(clickOnCheckBox).click();
    }

    public void clickOnRegistrationButton() {
        waitUntilExpectedWebElementVisible(registrationButton).click();
    }
}