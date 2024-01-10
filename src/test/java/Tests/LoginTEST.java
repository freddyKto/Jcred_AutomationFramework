package Tests;

import utilities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;



public class LoginTEST extends BaseTest {
         LoginPage loginPage;
         public LoginTEST() {
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

