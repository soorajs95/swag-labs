package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ShoppingCartPage;

public class ShoppingCartSteps {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Then("user can see the items in the shopping cart")
    public void userCanSeeTheItemsInTheShoppingCart() {
        shoppingCartPage.verifyItemsAddedToCart();
    }

    @Then("user can see the shopping cart is empty")
    public void userCanSeeTheShoppingCartIsEmpty() {
        shoppingCartPage.verifyCartEmpty();
    }

    @When("user clicks on checkout button")
    public void userClicksOnCheckoutButton() {
        shoppingCartPage.clickOnCheckoutButton();
    }
}
