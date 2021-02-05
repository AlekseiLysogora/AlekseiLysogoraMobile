package pageobjects.nativeapp.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.nativeapp.CoreNativePage;

public class BudgetPage extends CoreNativePage {

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
