package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutConfirmationPage extends BasePage {

    @FindBy(id = "checkout_complete_container")
    WebElement checkoutCompleteContainer;

    public CheckoutConfirmationPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyCheckoutConfirmation() {
        Assert.assertFalse(checkoutCompleteContainer.isDisplayed());
    }
}
