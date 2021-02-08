package pageobjects.nativeapp.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.nativeapp.CoreNativePage;

public class RegistrationPage extends CoreNativePage {

    @AndroidFindBy(id = APP_PACKAGE_NAME + "email_registration_form")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement emailRegistrationForm;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_email")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement emailTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_username")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement usernameTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_password")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement passwordTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "registration_confirm_password")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement confirmPasswordTextField;

    @AndroidFindBy(xpath = CLICK_ON_CHECKBOX)
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement clickOnCheckBox;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "register_new_account_button")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement registrationButton;

    public RegistrationPage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver, webDriverWait);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public WebElement getRegistrationForm() {
        return waitUntilExpectedWebElementVisible(emailRegistrationForm);
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