package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage extends BasePage {

    @FindBy(id = "cart_contents_container")
    WebElement shoppingCartContainer;

    @FindBy(css = "[id^=remove-sauce-labs-]")
    List<WebElement> removeButtons;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyItemsAddedToCart() {
        Assert.assertTrue(shoppingCartContainer.isDisplayed());
        Assert.assertTrue(removeButtons.size() > 0);
    }

    public void verifyCartEmpty() {
        Assert.assertEquals(0, removeButtons.size());
    }

    public void clickOnCheckoutButton() {
        elementClick(checkoutButton);
    }
}
