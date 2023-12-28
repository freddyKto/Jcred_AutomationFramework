package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static utilities.BaseTest.driver;


public class PersonRecordsPage {

    public void personTrace() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until the element is visible and interactable
        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"P\"]")));

        // Check if the element is clickable
        if (ele.isEnabled() && ele.isDisplayed()) {
            ele.click();
            driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-11\"]/div/button[1]")).click();
        } else {

            System.out.println("Element is not clickable or visible.");

        }

    }


    public void personTracebyName(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        driver.findElement(By.xpath("//input[@formcontrolname='reference']")).sendKeys("QA_testing");
        // Wait until the element is visible and interactable
        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-35']")));

        // Check if the element is clickable
        if (ele.isEnabled() && ele.isDisplayed()) {
            ele.click();
            driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
        } else{

            System.out.println("Element is not clickable or visible.");

        }

        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-37']")));
        // Check if the element is clickable
        if (el.isEnabled() && ele.isDisplayed()) {
            el.click();
            driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
        } else{

            System.out.println("Element is not clickable or visible.");

        }

    }
}
