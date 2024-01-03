package Tests;

import org.testng.annotations.Test;
import pages.DeceasedEstatePage;
import pages.LoginPage;
import utilities.BaseTest;

public class DeceasedEstateTest extends BaseTest {
    DeceasedEstatePage deceasedEstatePage;
    LoginPage loginPage;

    public DeceasedEstateTest(){
        super();

        loginPage = new LoginPage();

    }

    @Test
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);
        deceasedEstatePage = new DeceasedEstatePage();
    }

    @Test
    public void DeceasedEstate(){

        deceasedEstatePage.DeceasedEstate();
    }
}
