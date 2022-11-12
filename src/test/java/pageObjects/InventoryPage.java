package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {

    String addToCartButton = "add-to-cart-sauce-labs-%s";
    String removeButton = "remove-sauce-labs-%s";

    @FindBy(id = "inventory_container")
    WebElement inventoryContainer;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartIcon;

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyInventoryPageLoaded() {
        Assert.assertTrue(inventoryContainer.isDisplayed());
    }

    public void addItemToCart(String item) {
        elementClick(By.id(String.format(addToCartButton, item)));
    }

    public void removeItemFromCart(String item) {
        elementClick(By.id(String.format(removeButton, item)));
    }

    public void clickOnShoppingCartIcon() {
        elementClick(shoppingCartIcon);
    }

}
