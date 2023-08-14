package pages;

import object_locators.LandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseTest;

public class TuteeSignupPage extends BaseTest {

    private WebDriver driver;
    private LandingPageLocators landingPageLocators;
    public TuteeSignupPage() {

        landingPageLocators = new LandingPageLocators();
    }


    public void goToTuteeSignupPage()
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnTuteeSignUp"))).click();

    }

    public void enterFirstName(String fName)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtTuteeFname"))).sendKeys(fName);

    }

    public void enterSecondName(String SName)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtTuteeSname"))).sendKeys(SName);
    }

    public void SelectRace(String SelectRace)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("Sele_Race"))).sendKeys(SelectRace);
    }

    public void clickNext()
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnNext"))).click();
    }


}
