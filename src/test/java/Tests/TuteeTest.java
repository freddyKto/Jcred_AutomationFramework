package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TuteePage;
import utilities.BaseTest;
import utils.ExcelDataProvider;

public class TuteeTest extends BaseTest {

    TuteePage tuteePage;
    LoginPage loginPage;

    public TuteeTest() throws Exception {
        super();
        tuteePage = new TuteePage();
        loginPage = new LoginPage();

        new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_007");

    }

    @Test( priority = 1)
    public void  Entering_tutorName_Selecting() {
        String tutorName = ExcelDataProvider.getCellData(9, 6);
        String dropdownPartialOption = "ThePartialOptionYouWantToSelect";
        tuteePage.HomeSearch(tutorName, dropdownPartialOption);

        tuteePage.clickTutorName(tutorName);
    }


    @Test( priority = 2)
    public void Login(){

        // steps for logging in
//        String email = ExcelDataProvider.getCellData(9, 6);
//        String password = ExcelDataProvider.getCellData(10, 6);
        loginPage.enterEmailAddressLogin("freddy@ktopportunities.co.za");
        loginPage.enterPasswordLogin("1234567890");
        loginPage.clickLoginLogin();

    }


    @Test( priority = 3)
    public void ClickReqLesson() {

        tuteePage.clickRequestLesson();
    }



}
