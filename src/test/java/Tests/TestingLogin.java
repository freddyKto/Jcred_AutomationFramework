package Tests;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import utilities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelDataProvider;



public class TestingLogin extends BaseTest {

         LoginPage loginPage;

         public TestingLogin() throws Exception {
        super();
        loginPage = new LoginPage();


         }



      @Test
       public void login() {

        String email = "freddy@kto.co.za";
        String password = "!@12345Kto1";

        loginPage.Login(email, password);

    }


}

