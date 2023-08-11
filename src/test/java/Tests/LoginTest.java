package Tests;

import utilities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelDataProvider;

import java.io.IOException;


public class LoginTest extends BaseTest {

         LoginPage loginPage;
         ExcelDataProvider excelDataProvider;


         public LoginTest() {
        super();
        loginPage = new LoginPage();
        excelDataProvider = new ExcelDataProvider("C:\\Users\\Freddy\\Desktop\\simplytutors_testcases.xlsx");

         }

          @Test(groups = { "Click Login button" }, priority = 1)
         public void TC001_LoginB() {
         loginPage.goToLoginPage();
      }


         @Test(groups = { "Enter email" }, priority = 2)
         public void TC002_EnterMail() throws IOException {
             Object[][] data = excelDataProvider.getTestData("simplytutors_testcases.xlsx");
             String email = (String) data[10][7];
             loginPage.enterEmailAddressLogin(email);
     }


         @Test(groups = { "Enter password" }, priority = 3)
         public void TC003_EnterPassword() throws IOException {
             Object[][] data = excelDataProvider.getTestData("simplytutors_testcases.xlsx");
             String password = (String) data[11][7];
             loginPage.enterPasswordLogin(password);
     }


         @Test(groups = { "Click signing" }, priority = 4)
         public void TC004_ClickLogin() {

             loginPage.clickLoginLogin();
     }


    }

