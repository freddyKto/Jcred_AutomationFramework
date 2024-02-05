package PageObjects;


import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import static utilities.BaseTest.driver;

public class DeedsOfficePage {

    AbstractComponent webDriverUtils;

    public DeedsOfficePage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void deedsOffice() {
        System.out.println("Deeds office search");
        webDriverUtils.clickElement(By.xpath("//strong[text()='PROPERTY']"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deeds Office ']"));


        webDriverUtils.sendKeys(By.name("form.Reference"), "deeds search");
        webDriverUtils.clickElement(By.name("DeedsOffice"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Pretoria ']"));

        webDriverUtils.clickElement(By.xpath("//mat-label[text()='Search Parameters']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Deeds Office Person ']"));

        webDriverUtils.sendKeys(By.name("form.Surname"), " ");
        webDriverUtils.sendKeys(By.name("form.Firstname"), "");
        webDriverUtils.sendKeys(By.name("form.IDNumber"), "");


    }
}
