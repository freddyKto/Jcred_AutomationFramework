package Tests;

import PageObjects.LoginPage;
import org.testng.annotations.Test;
import pagesObject.CreditSearchPage;
import utilities.BaseTest;

public class CreditTest extends BaseTest {

    CreditSearchPage creditSearchPage;
    LoginPage loginPage;

    public CreditTest(){
        super();

        loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);

    }

    @Test  (priority = 2)
    public void Credit(){
        creditSearchPage = new CreditSearchPage();
        creditSearchPage.ClickingCreditButton();
    }

    @Test  (priority = 3)
    public void ExperianConsumerProfile (){

        creditSearchPage.ExperianConsumerProfile();

    }
}
