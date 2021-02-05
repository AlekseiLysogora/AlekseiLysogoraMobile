package pageobjects.nativeapp.pages;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.nativeapp.CoreNativePage;

public class NativeHomePage extends CoreNativePage {

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

    //attempt to solve the additional task
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