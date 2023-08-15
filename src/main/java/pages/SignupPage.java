package pages;

import object_locators.LandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseTest;

public class SignupPage extends BaseTest {


    private LandingPageLocators landingPageLocators;
    public SignupPage() {

        landingPageLocators = new LandingPageLocators();
    }


    public void goToTutorSignupPage()
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnTutorSignUp"))).click();

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

    public void enterSecondTutorName(String SName)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtTutorSName"))).sendKeys(SName);
    }

    public void SelectRace(String SeleRace)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("Sele_Race"))).sendKeys(SeleRace);
    }

    public void clickPrevious()
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("btnNext"))).click();
    }

    public void clickNext()
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("btnNext"))).click();
    }


    public void SelectInstitution(String SeleInstitution)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("Sele_Institution"))).sendKeys(SeleInstitution);
    }


    public void enteringEmail(String Email)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtEmail"))).sendKeys(Email);
    }


    public void enteringContactNo(String ContactNo)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtContactNo"))).sendKeys(ContactNo);
    }


    public void selectSpoken1(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtSpoken1"))).sendKeys(ContactNo);
    }


    public void selectSpoken2(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtSpoken2"))).sendKeys(ContactNo);
    }


    public void selectSpoken3(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtSpoken3"))).sendKeys(ContactNo);
    }


    public void selectWritten1(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtWritten1"))).sendKeys(ContactNo);
    }


    public void electWritten2(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtWritten2"))).sendKeys(ContactNo);
    }


    public void electWritten3(String ContactNo)
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("txtWritten3"))).sendKeys(ContactNo);
    }




}
