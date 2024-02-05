package Tests;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.DeedsOfficePage;
import utilities.BaseTest;

public class DeedsOfficeTEST extends BaseTest {

    LoginPage loginPage;
    DeedsOfficePage propertyPage;
    public DeedsOfficeTEST(){
        super();

        loginPage = new LoginPage();

    }

    @Test
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);
        propertyPage= new DeedsOfficePage();
    }

    @Test
    public void deedsOffice(){

        propertyPage.deedsOffice();
    }
}
