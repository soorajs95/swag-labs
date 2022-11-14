package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is in swag labs home page")
    public void userIsInSwagLabsHomePage() {
        loginPage.navigateToHomePage();
    }

    @When("user logs in with credentials")
    public void userLogsInWithCredentials(Map<String, String> loginDetails) {
        loginPage.login(loginDetails);
    }

    @Then("user should see login error")
    public void userShouldSeeLoginError() {
        loginPage.verifyLoginError();
    }

    @And("^user logs in as (standard|locked_out|problem|performance_glitch) user$")
    public void userLogsInAsUser(String userType) {
        loginPage.login(userType);
    }
}
