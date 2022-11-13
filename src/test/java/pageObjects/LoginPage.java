package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = "[data-test=error]")
    WebElement loginError;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(Map<String, String> loginDetails) {
        setText(userNameInput, loginDetails.get("username"));
        setText(passwordInput, loginDetails.get("password"));
        elementClick(loginButton);
    }

    public void login(String userType) {
        setText(userNameInput, setValue(userType));
        setText(passwordInput, setValue("password"));
        elementClick(loginButton);
    }

    public void verifyLoginError() {
        Assert.assertTrue(loginError.isDisplayed());
    }
}
