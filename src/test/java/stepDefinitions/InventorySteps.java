package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.InventoryPage;

import java.util.List;

public class InventorySteps {

    InventoryPage inventoryPage = new InventoryPage();

    @Then("user should see the inventory page")
    public void userShouldSeeTheInventoryPage() {
        inventoryPage.verifyInventoryPageLoaded();
    }

    @When("user adds items to the shopping cart")
    public void userAddsItemsToTheShoppingCart(List<String> items) {
        inventoryPage.addItemsToCart(items);
    }

    @And("user clicks on the shopping cart icon")
    public void userClicksOnTheShoppingCartIcon() {
        inventoryPage.clickOnShoppingCartIcon();
    }

    @And("user removes items from the shopping cart")
    public void userRemovesItemsFromTheShoppingCart(List<String> items) {
        inventoryPage.removeItemsFromCart(items);
    }
}
