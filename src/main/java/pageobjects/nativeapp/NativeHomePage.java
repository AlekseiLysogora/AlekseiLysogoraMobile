package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativeHomePage extends CoreNativePage {

    @AndroidFindBy(id = APP_PACKAGE_NAME + "register_button")
    WebElement registerNewAccountBtn;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_email")
    WebElement inputLoginOrEmailTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_pwd")
    WebElement passwordTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "email_sign_in_button")
    WebElement signInBtn;

    public NativeHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void openRegistrationPage() {
        waitUntilExpectedWebElementVisible(registerNewAccountBtn).click();
    }

    public void fillEmailTextFieldByCreatedEmail(String createdEmail) {
        waitUntilExpectedWebElementVisible(inputLoginOrEmailTextField).sendKeys(createdEmail);
    }

    public void fillPasswordTextFieldByCreatedPassword(String createdPassword) {
        waitUntilExpectedWebElementVisible(passwordTextField).sendKeys(createdPassword);
    }

    public void clickOnSignInButton() {
        waitUntilExpectedWebElementVisible(signInBtn).click();
    }
}