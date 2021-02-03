package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NativeHomePage extends CoreNativePage {

    @AndroidFindBy(id = APP_PACKAGE_NAME + "register_button")
    WebElement registerNewAccountBtn;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_email")
    WebElement inputLoginOrEmailTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "login_pwd")
    WebElement passwordTextField;

    @AndroidFindBy(id = APP_PACKAGE_NAME + "email_sign_in_button")
    WebElement signInBtn;

    private WebDriverWait wait;

    public NativeHomePage(AppiumDriver appiumDriver, WebDriverWait wait) {
        super(appiumDriver);
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void openRegistrationPage() {
        wait.until(ExpectedConditions.visibilityOf(registerNewAccountBtn));
        registerNewAccountBtn.click();
    }

    public void fillEmailTextFieldByCreatedEmail(String createdEmail) {
        wait.until(ExpectedConditions.visibilityOf(inputLoginOrEmailTextField));
        inputLoginOrEmailTextField.sendKeys(createdEmail);
    }

    public void fillPasswordTextFieldByCreatedPassword(String createdPassword) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.sendKeys(createdPassword);
    }

    public void clickOnSignInButton() {
        wait.until(ExpectedConditions.visibilityOf(signInBtn));
        signInBtn.click();
    }
}
