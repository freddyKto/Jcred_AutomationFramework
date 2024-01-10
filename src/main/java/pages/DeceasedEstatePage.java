package pages;

import org.openqa.selenium.By;
import utils.Utils;
import static utilities.BaseTest.driver;

public class DeceasedEstatePage {

    Utils webDriverUtils;

    public DeceasedEstatePage() {
        this.webDriverUtils = new Utils(driver);
    }
    public void deceasedEstate() {
        System.out.println("Deceased Estate search");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deceased Estate ']"));

    }


    public void deceasedEstatebyName() {
        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-1\"]"), "DeceasedEstateByName");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Name ']"));

        webDriverUtils.sendKeys(By.cssSelector("input[name='firstName']"), "RUDOLPH DENNIS");
        webDriverUtils.sendKeys(By.cssSelector("input[name='surname']"), "THOBEJANE");
        webDriverUtils.clickElement(By.xpath("//button[@type='submit']"));
//        webDriverUtils.clickElement(By.xpath(""));

    }


    public void deceasedEstatebyIdNumber() {
        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-1\"]"), "DeceasedEstateByName");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' ID Number ']"));

        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-4\"]"), "6503315524089");
        webDriverUtils.clickElement(By.xpath("//button[@type='submit']"));

    }

    public void deceasedEstatebyInformationID() {
        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-1\"]"), "DeceasedEstateByName");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Information ID ']"));

        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-2\"]"), "1565943");

        webDriverUtils.clickElement(By.xpath("//button[@type='submit']"));

    }

}
