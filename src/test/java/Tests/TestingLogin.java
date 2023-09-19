package Tests;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
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

             new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_003");

         }

      @BeforeMethod
       public void setUp() {
        Reporter.log("Step 1: Open the login page");
        loginPage.goToLoginPage();
      }


      @Test
       public void login() {

        // Step 2: Provide the email and password
        String email = ExcelDataProvider.getCellData(9, 6);
        String password = ExcelDataProvider.getCellData(10, 6);

        // Step 3: Call the login method to perform the login
        Reporter.log("Step 2: Provide the email and password");
        Reporter.log("Step 3: Call the login method to perform the login");
        loginPage.login(email, password);

    }


}

