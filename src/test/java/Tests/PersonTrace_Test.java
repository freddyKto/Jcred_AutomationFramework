package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PersonRecordsPage;
import utilities.BaseTest;

public class PersonTrace_Test extends BaseTest {
    PersonRecordsPage personRecordsPage;
    LoginPage loginPage;

    public PersonTrace_Test() throws Exception {
        super();

        loginPage = new LoginPage();

    }

    // Testing the person trace by Name
    @Test
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);
        personRecordsPage = new PersonRecordsPage();
    }

    @Test
    public void PersonRecords() {

        personRecordsPage.personTrace();
    }

//    @Test
//    public void PersonTracebyName() {
//
//        personRecordsPage.personTracebyName();
//    }

//    @Test
//    public void PersonTracebyIdNo(){
//        personRecordsPage.personTracebyID();
//    }

    @Test
    public void PersonTracebyContactNo(){
        personRecordsPage.personTracebyContactNo();
    }


}