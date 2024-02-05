package Tests;

import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.PersonRecordsPage;
import utilities.BaseTest;

public class PersonTraceTEST extends BaseTest {
    PersonRecordsPage personRecordsPage;
    LoginPage loginPage;

    public PersonTraceTEST()  {
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

//    @Test
//    public void PersonTracebyContactNo(){
//        personRecordsPage.personTracebyContactNo();
//    }

//    @Test
//    public void PersonVerificationbyName(){
//        personRecordsPage.personVerbyName();
//    }

//    @Test
//    public void PersonVerificationbyId(){
//        personRecordsPage.personVerbyID();
//    }

    @Test
    public void photoVerificationbyId(){
        personRecordsPage.IdPhoto_verification();
    }

}