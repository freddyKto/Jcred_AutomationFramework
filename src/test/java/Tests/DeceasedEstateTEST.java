package Tests;

import org.testng.annotations.Test;
import PageObjects.DeceasedEstatePage;
import PageObjects.LoginPage;
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
    public void PersonRecords() {
        deceasedEstatePage.deceasedEstate();
    }

//    @Test
//    public void deceasedEstatebyName(){
//
//        deceasedEstatePage.deceasedEstatebyName();
//    }

//    @Test
//    public void deceasedEstatebyIdNumber(){
//
//        deceasedEstatePage.deceasedEstatebyIdNumber();
//    }

    @Test
    public void deceasedEstatebyInformationID(){

        deceasedEstatePage.deceasedEstatebyInformationID();
    }
}
