package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Utils {


    private WebDriver driver;
    private WebDriverWait wait;

    public Utils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void sendKeys(By by, String text) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.clear();
        element.sendKeys(text);
    }

    public void clickElement(By by) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public void selectOptionByVisibleText(By by, String optionText) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(element);
        select.selectByVisibleText(optionText);
    }

    public void checkCheckbox(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        if (!element.isSelected()) {
            element.click();
        }
    }
}
