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
        webDriverUtils.sendKeys(By.xpath("//*[@id=\"mat-input-1\"]"), "DeceasedEstate");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Name ']"));



    }


    public void deceasedEstatebyIdNumber() {
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deceased Estate ']"));

    }

    public void deceasedEstatebyInformationID() {
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deceased Estate ']"));

    }

}
