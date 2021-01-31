package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void setNewEmail(String newEmail) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.sendKeys(newEmail);
    }

    public void setNewUsername(String newUsername) {
        wait.until(ExpectedConditions.visibilityOf(usernameTextField));
        usernameTextField.sendKeys(newUsername);
    }

    public void setNewPassword(String newPassword) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.sendKeys(newPassword);
    }

    public void confirmPasswordTextField(String newPassword) {
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordTextField));
        confirmPasswordTextField.sendKeys(newPassword);
    }

    public void clickOnCheckBox() {
        wait.until(ExpectedConditions.visibilityOf(clickOnCheckBox));
        clickOnCheckBox.click();
    }

    public void clickOnRegistrationButton() {
        wait.until(ExpectedConditions.visibilityOf(registrationButton));
        registrationButton.click();
    }
}