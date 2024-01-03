package pages;

import org.openqa.selenium.By;
import utilities.BaseTest;
import utils.Utils;
import static utilities.BaseTest.driver;

public class DeceasedEstatePage extends BaseTest {

    Utils webDriverUtils;

    public DeceasedEstatePage() {
        this.webDriverUtils = new Utils(driver);
    }
    public void DeceasedEstate() {
        System.out.println("Deceased Estate search");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//button[text()=' Deceased Estate ']"));

    }


}
