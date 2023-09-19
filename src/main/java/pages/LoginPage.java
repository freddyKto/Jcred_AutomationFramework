package pages;

import object_locators.LandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class LoginPage extends BaseTest {

    private LandingPageLocators landingPageLocators;
    public LoginPage() {

        landingPageLocators = new LandingPageLocators();
    }

    public void goToLoginPage()
    {
        BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnLogin"))).click();
    }

    public void login(String email, String password) {
        WebElement emailInput = BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtEmailAddressLogin")));
        WebElement passwordInput = BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtPasswordLogin")));
        WebElement loginButton = BaseTest.driver.findElement(By.cssSelector(landingPageLocators.getLocator("btnLoginLogin")));

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
