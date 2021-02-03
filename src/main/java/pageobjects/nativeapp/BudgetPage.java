package pageobjects.nativeapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BudgetPage extends CoreNativePage {

    @AndroidFindBy(xpath = "//*[contains(@text, 'BudgetActivity')]")
    WebElement budgetActivityTitle;

    public BudgetPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public String getActivityTitle() {
        return budgetActivityTitle.getText();
    }
}
