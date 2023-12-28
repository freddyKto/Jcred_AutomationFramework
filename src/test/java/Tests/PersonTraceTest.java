package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PersonRecordsPage;
import utilities.BaseTest;

public class PersonTraceTest extends BaseTest {
    PersonRecordsPage personRecordsPage;
    LoginPage loginPage;

    public PersonTraceTest() throws Exception {
        super();

        loginPage = new LoginPage();
        personRecordsPage = new PersonRecordsPage();
    }

    // Testing the person trace by Name

    @Test(description = "Logging with username and password")
    public void Login() {
        String email = "raymond@kto.co.za";
        String password = "dEv@12345";
        loginPage.Login(email, password);
    }

    @Test(description = "Performing person trace searches")
    public void PersonRecords() {
        personRecordsPage.personTrace();
    }

    @Test(description = "Performing person trace by NAME")
    public void PersonTracebyName() {
        personRecordsPage.personTracebyName();
    }
}