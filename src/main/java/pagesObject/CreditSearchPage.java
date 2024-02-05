package pagesObject;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.BaseTest.driver;

public class CreditSearchPage {

    AbstractComponent webDriverUtils;

    public CreditSearchPage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void ClickingCreditButton() {
        System.out.println("Performing Credit search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Cred\"]")));
        element.click();
    }

    public void ExperianConsumerProfile() {
        System.out.println("Stepping into experian consumer profile search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-menu-panel-14\"]/div/button[1]")));
        element.click();
        driver.findElement(By.xpath("//button[@routerlink='/admin/experianconsumerprofile']")).click();
    }

}
