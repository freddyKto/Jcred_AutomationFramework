package Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TuteePage;
import utilities.BaseTest;
import utils.ExcelDataProvider;

public class TestingBooking extends BaseTest {

    TuteePage tuteePage;
    LoginPage loginPage;

    public TestingBooking() throws Exception {
        super();
        tuteePage = new TuteePage();
        loginPage = new LoginPage();

        new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_007");

    }

    @Test( priority = 1)
    public void  getTutorName() throws Exception {
        Reporter.log("Step 1: Searched for tutor and clicked their name");
        String tutorName = ExcelDataProvider.getCellData(9, 6);
        tuteePage.HomeSearch(tutorName);
    }

    @Test(priority = 2)
    public void Login()  throws Exception{
        // Provide the email and password here
        String email = "freddy@ktopportunities.co.za";
        String password = "1234567890";
        Thread.sleep(5000);

        // Call the login method to perform the login
        Reporter.log("Step 2: Provide the email and password");
        Reporter.log("Step 3: Call the login method to perform the login");
        loginPage.login(email, password);

    }


    @Test( priority = 3)
    public void ClickReqLesson()  throws Exception{
        Thread.sleep(10000);

        Reporter.log("Step 4: Clicked request lesson");
        tuteePage.clickRequestLesson();
    }


}
