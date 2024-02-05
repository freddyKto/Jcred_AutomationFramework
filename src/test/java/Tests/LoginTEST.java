package Tests;

import utilities.BaseTest;
import org.testng.annotations.Test;
import PageObjects.LoginPage;



public class LoginTest extends BaseTest {
         LoginPage loginPage;
         public LoginTest() {
        super();
        loginPage = new LoginPage();
         }

      @Test
       public void login() {

        String email = "thoriso@kto.co.za";
        String password = "Juanita-90";
        loginPage.Login(email, password);

    }

}

