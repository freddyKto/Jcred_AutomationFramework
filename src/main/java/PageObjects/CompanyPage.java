package PageObjects;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import static utilities.BaseTest.driver;

public class CompanyPage {

    AbstractComponent webDriverUtils;

    public CompanyPage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void cipc_company() {
        System.out.println("company search");
        webDriverUtils.clickElement(By.id("company"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' CIPC Company ']"));

    }

    public void companyName_Registration(){
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "Company name");
        webDriverUtils.clickElement(By.xpath("//mat-select[@formcontrolname='seaType']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Company Name/Registration ']"));
        webDriverUtils.clickElement(By.xpath("//mat-select[@formcontrolname='cipcSearchby']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Exact Match ']"));
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='companyName']"), "KTO digital");

        webDriverUtils.clickElement(By.xpath("//span[text()='Perform Search']"));

        // view more
        webDriverUtils.clickElement(By.xpath("//*[@id=\"ViewMore\"]/span[1]"));

        // Export to PDF
        webDriverUtils.clickElement(By.xpath("//mat-icon[text()='file_download']"));
    }

    public void directorName(){
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "Director name");
        webDriverUtils.clickElement(By.xpath("//mat-select[@formcontrolname='seaType']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Director Name ']"));
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='directorfirstname']"), "Thoriso");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='directorlastname']"), "Rangata");

        webDriverUtils.clickElement(By.xpath("//span[text()='Perform Search']"));

        // view more
        webDriverUtils.clickElement(By.xpath("//*[@id=\"ViewMore\"]/span[1]"));

        // Export to PDF
        webDriverUtils.clickElement(By.xpath("//mat-icon[text()='file_download']"));
    }
}
