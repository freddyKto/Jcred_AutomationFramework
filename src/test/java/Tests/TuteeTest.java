package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TuteePage;
import utils.ExcelDataProvider;

public class TuteeTest {
    
    TuteePage tuteePage;
    LoginPage loginPage;

    public TuteeTest() throws Exception {
        super();
        tuteePage = new TuteePage();
        loginPage = new LoginPage();

        new ExcelDataProvider("TUTEE_SIMPLYTUTORS.xlsx","TSC_TUTEE_003");

    }

    @Test(groups = { "Entering tutor's name " }, priority = 1)
    public void Entering_tutorName() {
        String tutorName = ExcelDataProvider.getCellData(9, 6);
        String dropdownPartialOption = ExcelDataProvider.getCellData(9, 7); // Assuming dropdown option column is 7
        tuteePage.HomeSearch(tutorName, dropdownPartialOption);

        // steps for logging in
        String email = ExcelDataProvider.getCellData(9, 6);
        String password = ExcelDataProvider.getCellData(10, 6);
        loginPage.goToLoginPage();
        loginPage.enterEmailAddressLogin(email);
        loginPage.enterPasswordLogin(password);
        loginPage.clickLoginLogin();

    }


}
