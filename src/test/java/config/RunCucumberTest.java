package config;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/features"},
        monochrome = true,
        glue = {"stepDefinitions"})

public class RunCucumberTest {

}
