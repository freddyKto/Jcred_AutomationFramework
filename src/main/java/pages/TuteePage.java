package pages;

import object_locators.LandingPageLocators;
import object_locators.TuteePageLocators;
import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;
import java.util.List;
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

        List<WebElement> elements = driver.findElements(By.xpath("//strong[text()='" + tutorName + "']"));

        if (elements.size() > 0) {
            elements.get(0).click(); // Click the first matching element
        } else {
            throw new NoSuchElementException("Element with text '" + tutorName + "' not found.");
        }

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

        } else if (locatorKey.equals("timeOfTheDay")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByVisibleText(timeOfDay);

        } else if (locatorKey.equals("alternateDate")) {
            WebElement datePicker = driver.findElement(dropdownLocator);
            datePicker.sendKeys(dateToSelect.toString());

        } else if (locatorKey.equals("alternate_timeOfTheDay")) {
            Select dropdown = new Select(driver.findElement(dropdownLocator));
            dropdown.selectByValue(timeOfDay);

        } else {
            System.out.println("Dropdown not recognized.");
        }
    }


    public void enterAreaOfDifficulty(String text) {
        WebElement areaOfDiff = driver.findElement(By.xpath(tuteePageLocators.getLocator("AreaOfDiff")));
        areaOfDiff.clear();
        areaOfDiff.sendKeys(text);
    }

    public void enterLessonExpectation(String text) {
        WebElement lessonExpectation = driver.findElement(By.xpath(tuteePageLocators.getLocator("LessonExpectation")));
        lessonExpectation.clear();
        lessonExpectation.sendKeys(text);
    }

    public void enterAverageToDate(String text) {
        WebElement lessonExpectation = driver.findElement(By.xpath(tuteePageLocators.getLocator("YouBursaryProvider")));
        lessonExpectation.clear();
        lessonExpectation.sendKeys(text);
    }


    public void submitRequest() {
        driver.findElement(By.xpath(tuteePageLocators.getLocator("btnSubmitReq"))).click();
    }
}





