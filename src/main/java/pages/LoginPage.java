package pages;

import object_locators.LandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;

public class LoginPage extends BaseTest {

    private WebDriver driver;
    private LandingPageLocators landingPageLocators;
    public LoginPage() {

        landingPageLocators = new LandingPageLocators();
    }

    public void goToLoginPage()
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("btnTuteeSignUp"))).click();

    }

    public void enterEmailAddressLogin(String email)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtEmailAddressLogin"))).sendKeys(email);

    }

    public void enterPasswordLogin(String password)
    {
        driver.findElement(By.xpath(landingPageLocators.getLocator("txtPasswordLogin"))).sendKeys(password);
    }

    public void clickLoginLogin()
    {
        driver.findElement(By.xpath(landingPageLocators.getLocator("btnLoginLogin"))).click();
    }

}
