package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;


public class LoginPage extends BaseTest {


    public void Login(String email, String password) {
        WebElement emailInput = BaseTest.driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        WebElement passwordInput = BaseTest.driver.findElement(By.xpath("//input[@data-placeholder='Password']"));
        WebElement  loginButton = BaseTest.driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        System.out.println("Logging with username and password");
    }


}
