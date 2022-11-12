package pageObjects;

import config.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Utils {

    final WebDriver driver = getDriver();

    public WebDriverWait webDriverWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(setValue("webdriver_wait_timeout"))));
    }

    public void waitUntilElementVisible(WebElement element) {
        webDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void setText(WebElement element, String text) {
        waitUntilElementVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public void elementClick(WebElement element) {
        try {
            webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (StaleElementReferenceException e) {
            element.click();
        }
    }

    public void elementClick(By locator) {
        webDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public void navigateToHomePage() {
        driver.get(readConfig("test_url"));
    }

}
