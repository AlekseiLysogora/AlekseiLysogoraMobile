package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BudgetPage extends BaseNativePage {

    @AndroidFindBy(xpath = "//*[contains(@text, 'BudgetActivity')]")
    WebElement budgetActivityTitle;

    public BudgetPage(AppiumDriver appiumDriver, WebDriverWait webDriverWait) {
        super(appiumDriver, webDriverWait);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public String getActivityTitle() {
        return budgetActivityTitle.getText();
    }
}
