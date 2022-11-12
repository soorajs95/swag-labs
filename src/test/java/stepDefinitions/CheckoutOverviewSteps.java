package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutOverviewPage;

public class CheckoutOverviewSteps {

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    @Then("user can see to checkout overview page")
    public void userCanSeeToCheckoutOverviewPage() {
        checkoutOverviewPage.verifyCheckoutSummary();
    }

    @When("user clicks on finish button")
    public void userClicksOnFinishButton() {
        checkoutOverviewPage.clickOnFinishButton();
    }
}
