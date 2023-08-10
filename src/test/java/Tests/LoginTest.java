package Tests;

import utilities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelDataProvider;


public class LoginTest extends BaseTest {

         LoginPage loginPage;
         ExcelDataProvider excelDataProvider;


         public LoginTest() {
        super();
        loginPage = new LoginPage();
      }

          @Test(groups = { "Click Login button" })
         public void TC001_LoginB() {
         loginPage.goToLoginPage();
      }


//         @Test(groups = { "Enter email" })
//         public void TC002_EnterMail() throws IOException {
//             Object[][] data = excelDataProvider.getTestData("Book1");
//             String email = (String) data[0][1];
//             LoginPage.enterEmailAddressLogin(email);
//     }
//
//
//         @Test(groups = { "Enter password" })
//         public void TC003_EnterPassword() throws IOException {
//             Object[][] data = excelDataProvider.getTestData("Book1");
//             String password = (String) data[1][1];
//             LoginPage.enterPasswordLogin(password);
//     }
//
//
//         @Test(groups = { "Click signing" })
//         public void TC004_ClickLogin() {
//
//             LoginPage.clickLoginLogin();
//     }
//

    }

