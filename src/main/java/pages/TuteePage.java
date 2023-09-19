package pages;

import object_locators.LandingPageLocators;
import object_locators.TuteePageLocators;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;
import java.time.LocalDate;


public class TuteePage extends BaseTest {



    private LandingPageLocators landingPageLocators;
    TuteePageLocators tuteePageLocators;
    public TuteePage() {

        landingPageLocators = new LandingPageLocators();
        tuteePageLocators = new TuteePageLocators();
    }

    public void HomeSearch(String tutorName) throws Exception
    {
        WebElement searchBox = driver.findElement(By.xpath(landingPageLocators.getLocator("txtHomeSearch")));
        searchBox.sendKeys(tutorName);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//strong[contains(text(), '"+tutorName+"')])[4]")).click();

            }

        public void clickRequestLesson() throws Exception
        {
            Thread.sleep(1000);
            BaseTest.driver.findElement(By.xpath(tuteePageLocators.getLocator("btnReqLesson"))).click();
        }

    public void selectDropdownOption(String locatorKey, String optionToSelect, LocalDate dateToSelect, String timeOfDay) {
        By dropdownLocator = By.xpath(tuteePageLocators.getLocator(locatorKey));

        if (locatorKey.equals("dropdownCourse")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByVisibleText(optionToSelect);

        } else if (locatorKey.equals("dropdownLength")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByVisibleText(optionToSelect);

        } else if (locatorKey.equals("dropdownLocation")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByVisibleText(optionToSelect);

        } else if (locatorKey.equals("dropdownAlternateLocation")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByVisibleText(optionToSelect);

        } else if (locatorKey.equals("datePicker")) {
            WebElement datePicker = driver.findElement(dropdownLocator);
            datePicker.sendKeys(dateToSelect.toString());

        } else if (locatorKey.equals("timeDropdown")) {
            Select timeDropdown = new Select(driver.findElement(dropdownLocator));
            timeDropdown.selectByVisibleText(timeOfDay);

        } else if (locatorKey.equals("alternateDate")) {
            WebElement datePicker = driver.findElement(dropdownLocator);
            datePicker.sendKeys(dateToSelect.toString());

        } else if (locatorKey.equals("alternateTime")) {
            Select timeDropdown = new Select(driver.findElement(dropdownLocator));
            timeDropdown.selectByVisibleText(timeOfDay);
        } else {
            System.out.println("Dropdown not recognized.");
        }
    }

      public void enterTextIntoFields(By locator1, String text1, By locator2, String text2, By locator3, String text3) {
        WebElement AreaOfDifficulty = driver.findElement(locator1);
        WebElement LessonExpectation = driver.findElement(locator2);
        WebElement Average = driver.findElement(locator3);

        AreaOfDifficulty.clear();
        AreaOfDifficulty.sendKeys(text1);

        LessonExpectation.clear();
        LessonExpectation.sendKeys(text2);

        Average.clear();
        Average.sendKeys(text3);
    }

}





