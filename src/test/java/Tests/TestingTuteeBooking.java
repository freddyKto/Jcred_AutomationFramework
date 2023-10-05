package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TuteePage;
import utilities.BaseTest;
import utils.ExcelDataProvider;

import java.time.LocalDate;

public class TestingTuteeBooking extends BaseTest {

    TuteePage tuteePage;
    LoginPage loginPage;

    public TestingTuteeBooking() throws Exception {
        super();
        tuteePage = new TuteePage();
        loginPage = new LoginPage();

        new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_007");

    }

    @Test( priority = 1)
    public void  searchedAndClickedForTutorsName() throws Exception {
        Reporter.log("Step 1: Searched for tutor and clicked their name");
        String tutorName = ExcelDataProvider.getCellData(9, 6);
        tuteePage.HomeSearch(tutorName);
        Thread.sleep(5000);
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
        Reporter.log("Step 4: Clicked request lesson");
        Thread.sleep(10000);
      tuteePage.clickRequestLesson();
    }

    @Test(priority = 4)
    public void testDropdownSelection() throws Exception {
        try {
            // Select a course from the dropdown by value
            tuteePage.selectDropdownOption("dropdownCourse", "1320", null, null);

            // Select lesson length from the dropdown by visible text
            tuteePage.selectDropdownOption("dropdownLength", "1 Hour", null, null);

            // Select lesson location from the dropdown by visible text
            tuteePage.selectDropdownOption("dropdownLocation", "At Home", null, null);

            // Select alternate location from the dropdown by visible text
            tuteePage.selectDropdownOption("dropdownAlternateLocation", "At University", null, null);

            // Enter a date in the date picker
            tuteePage.selectDropdownOption("datePicker", null, LocalDate.of(2023, 10, 3), null);

            // Select time of the day from the dropdown by visible text
            tuteePage.selectDropdownOption("timeOfTheDay", null, null, "Morning");

            // Enter an alternate date in the date picker
            tuteePage.selectDropdownOption("alternateDate", null, LocalDate.of(2023, 10, 4), null);

            // Select alternate time of the day from the dropdown by value
            tuteePage.selectDropdownOption("alternate_timeOfTheDay", null, null, "Afternoon");


            // Enter an area of difficulty
            tuteePage.enterAreaOfDifficulty("Algebra");

            // Enter lesson expectation
            tuteePage.enterLessonExpectation("Improve problem-solving skills");

            // Enter average to date
            tuteePage.enterAverageToDate("11");

            // Example 12: Submit the request
            tuteePage.submitRequest();


        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }

}
