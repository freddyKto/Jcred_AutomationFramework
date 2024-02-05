package Tests;

import PageObjects.CompanyPage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class CIPC_CompanyTest extends BaseTest {

    LoginPage loginPage;
    CompanyPage companyPage;

    public CIPC_CompanyTest(){
        super();

        loginPage = new LoginPage();

    }

    @Test
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);
        companyPage = new CompanyPage();
    }

    @Test
    public void cipc_company() {

        companyPage.cipc_company();
    }

    @Test
    public void companyName_Registration(){
        companyPage.companyName_Registration();
    }

//    @Test
//    public void directorName(){
//        companyPage.directorName();
//    }
}
