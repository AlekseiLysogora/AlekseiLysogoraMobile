package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class NativeHomePage extends BaseNativePage {

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_form")
    WebElement loginForm;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "register_button")
    WebElement registerNewAccountBtn;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_email")
    WebElement inputLoginOrEmailTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_pwd")
    WebElement passwordTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "email_sign_in_button")
    WebElement signInBtn;

    private List<String> text;

    public NativeHomePage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver, webDriverWait);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public List<String> getEmailPasswordTxtFields() {
        text = new ArrayList<>();
        text.add(inputLoginOrEmailTextField.getText());
        text.add(passwordTextField.getText());
        return text;
    }

    /*
     * This method returns the login form of Home page.
     */
    public WebElement getLoginForm() {
        return waitUntilExpectedWebElementVisible(loginForm);
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