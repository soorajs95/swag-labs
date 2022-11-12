package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.CheckoutInfoPage;

import java.util.Map;

public class CheckoutInfoSteps {

    CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage();

    @And("user fills in checkout information")
    public void userFillsInCheckoutDetails(Map<String, String> checkoutInfo) {
        checkoutInfoPage.fillCheckoutInfo(checkoutInfo);
    }

    @And("clicks on continue button")
    public void clicksOnContinueButton() {
        checkoutInfoPage.clickOnContinueButton();
    }
}
