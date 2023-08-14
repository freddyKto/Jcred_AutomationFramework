package Tests;

import utilities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelDataProvider;
import java.io.IOException;


public class LoginTest extends BaseTest {

         LoginPage loginPage;

         public LoginTest() throws Exception {
        super();
        loginPage = new LoginPage();

             new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_003");

         }

          @Test(groups = { "Opening login page" }, priority = 1)
         public void Opening_loginPAGE() {
         loginPage.goToLoginPage();
      }


         @Test(groups = { "Entering email" }, priority = 2)
         public void Entering_email() {
             String email = ExcelDataProvider.getCellData(9,6);
             loginPage.enterEmailAddressLogin(email);
     }


         @Test(groups = { "Entering password" }, priority = 3)
         public void Entering_password() {
             String password = ExcelDataProvider.getCellData(10,6);
             loginPage.enterPasswordLogin(password);
     }


         @Test(groups = { "Click signing button" }, priority = 4)
         public void Login() {

             loginPage.clickLoginLogin();
     }


    }

