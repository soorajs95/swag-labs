package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutConfirmationPage;

public class CheckoutConfirmationSteps {

    CheckoutConfirmationPage checkoutConfirmationPage = new CheckoutConfirmationPage();

    @Then("user can see the order confirmation")
    public void userCanSeeTheOrderConfirmation() {
        checkoutConfirmationPage.verifyCheckoutConfirmation();
    }
}
