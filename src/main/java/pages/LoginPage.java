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

    public void Login(String email, String password) {
        WebElement emailInput = BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtEmail")));
        WebElement passwordInput = BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("txtPassword")));
        WebElement loginButton = BaseTest.driver.findElement(By.xpath(landingPageLocators.getLocator("btnLogin")));

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
