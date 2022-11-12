package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver extends Utils {

    static final String browser = setValue("browser");

    public static WebDriver getBrowserDriver() {
        return switch (browser.toLowerCase()) {
            case "firefox" -> new FirefoxDriver(firefoxOptions());
            case "edge" -> new EdgeDriver(edgeOptions());
            default -> new ChromeDriver(chromeOptions());
        };
    }

    public static FirefoxOptions firefoxOptions() {
        FirefoxOptions ffOptions = new FirefoxOptions();
        ffOptions.setHeadless(Boolean.parseBoolean(setValue("headless")));
        return ffOptions;
    }

    public static ChromeOptions chromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(Boolean.parseBoolean(setValue("headless")));
        return chromeOptions;
    }

    public static EdgeOptions edgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setHeadless(Boolean.parseBoolean(setValue("headless")));
        return new EdgeOptions();
    }

}
