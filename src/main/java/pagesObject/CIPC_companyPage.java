package pagesObject;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static utilities.BaseTest.driver;

public class CIPC_companyPage {

    AbstractComponent webDriverUtils;

    public CIPC_companyPage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void cipcCompany() {
        System.out.println("CIPCCompany search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"C\"]")));
        element.click();
        webDriverUtils.clickElement(By.xpath("//button[text()=' CIPC Company ']"));

    }
}
