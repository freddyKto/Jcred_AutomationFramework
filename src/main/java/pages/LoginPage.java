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
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnLogin"))).click();

    }

    public void enterEmailAddressLogin(String email)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtEmailAddressLogin"))).sendKeys(email);

    }

    public void enterPasswordLogin(String password)
    {
        BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtPasswordLogin"))).sendKeys(password);
    }

    public void clickLoginLogin()
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnLoginLogin"))).click();
    }

}
