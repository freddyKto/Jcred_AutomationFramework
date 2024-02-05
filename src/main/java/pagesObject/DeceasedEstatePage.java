package pagesObject;

import org.openqa.selenium.By;
import utilities.BaseTest;
import AbstractComponent.AbstractComponent;

public class DeceasedEstatePage extends BaseTest {

    AbstractComponent webDriverUtils;

    public DeceasedEstatePage() {
        this.webDriverUtils = new AbstractComponent(driver);
    }
    public void DeceasedEstate() {
        System.out.println("Deceased Estate search");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deceased Estate ']"));

    }


}
