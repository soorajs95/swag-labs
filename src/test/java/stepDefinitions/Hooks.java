package stepDefinitions;

import config.Driver;
import config.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = Driver.getBrowserDriver();
        Driver.addDriverToThreadLocal(driver);
        Utils.setBrowserSize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed())
            Utils.getScreenshot(scenario);
        Driver.getDriver().quit();
    }

}
