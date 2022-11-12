package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(id = "checkout_summary_container")
    WebElement checkoutSummaryContainer;

    @FindBy(id = "finish")
    WebElement finishButton;

    public CheckoutOverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyCheckoutSummary() {
        Assert.assertTrue(checkoutSummaryContainer.isDisplayed());
    }

    public void clickOnFinishButton() {
        elementClick(finishButton);
    }
}
