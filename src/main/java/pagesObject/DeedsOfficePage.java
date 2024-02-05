package pagesObject;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.BaseTest.driver;

public class DeedsOfficePage {

    AbstractComponent webDriverUtils;
    public DeedsOfficePage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void deedsOffice() {
        System.out.println("Deeds office search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"PP\"]")));
        element.click();
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deeds Office ']"));

    }
}
