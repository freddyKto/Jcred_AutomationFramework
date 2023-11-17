package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;

public class LandingPage extends BaseTest {

    WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        super();
        //initialization
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public void goTo()
    {
        driver.get("http://qa.j-cred.co.za/#/login");
    }



    // Add more methods for other actions on the landing page as needed
}






