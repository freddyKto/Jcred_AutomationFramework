package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PersonRecordsPage;
import utilities.BaseTest;

public class Person_traceTest extends BaseTest {
    PersonRecordsPage personRecordsPage;
    LoginPage loginPage;

    public Person_traceTest() throws Exception {
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
    public void PersonVerificationbyId(){
        personRecordsPage.IdPhoto_verification();
    }

}