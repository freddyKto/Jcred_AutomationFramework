package pages;

import object_locators.LandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class TuteePage extends BaseTest {

    private LandingPageLocators landingPageLocators;
    public TuteePage() {

        landingPageLocators = new LandingPageLocators();
    }

    public void HomeSearch(String tutorName, String dropdownPartialOption)
    {
        WebElement searchBox = driver.findElement(By.xpath(landingPageLocators.getLocator("txtHomeSearch")));
        searchBox.sendKeys(tutorName);

        // Handle the dropdown
        WebElement dropdownElement = driver.findElement(By.id("dropdownId")); // Replace with appropriate locator
        Select dropdown = new Select(dropdownElement);

        // Loop through dropdown options and select the one containing the provided partial option
        for (WebElement option : dropdown.getOptions()) {
            if (option.getText().contains(dropdownPartialOption)) {
                option.click();
                break;
            }
        }

    }
}
