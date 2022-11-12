package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class CheckoutInfoPage extends BasePage {

    @FindBy(css = "[data-test=firstName]")
    WebElement firstNameInput;

    @FindBy(css = "[data-test=lastName]")
    WebElement lastNameInput;

    @FindBy(css = "[data-test=postalCode]")
    WebElement zipcodeInput;

    @FindBy(css = "[data-test=continue]")
    WebElement continueButton;

    public CheckoutInfoPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillCheckoutInfo(Map<String, String> checkoutInfo) {
        setText(firstNameInput, checkoutInfo.get("firstName"));
        setText(lastNameInput, checkoutInfo.get("lastName"));
        setText(zipcodeInput, checkoutInfo.get("zipcode"));
    }

    public void clickOnContinueButton() {
        elementClick(continueButton);
    }


}
