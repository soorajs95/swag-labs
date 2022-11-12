package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.InventoryPage;

public class InventorySteps {

    InventoryPage inventoryPage = new InventoryPage();

    @Then("user should see the inventory page")
    public void userShouldSeeTheInventoryPage() {
        inventoryPage.verifyInventoryPageLoaded();
    }

    @When("user adds {} to the shopping cart")
    public void userAddsToTheShoppingCart(String item) {
        inventoryPage.addItemToCart(item);
    }

    @And("user clicks on the shopping cart icon")
    public void userClicksOnTheShoppingCartIcon() {
        inventoryPage.clickOnShoppingCartIcon();
    }

    @And("user removes {} from the shopping cart")
    public void userRemovesFromTheShoppingCart(String item) {
        inventoryPage.removeItemFromCart(item);
    }
}
