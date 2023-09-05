package pages;

import object_locators.LandingPageLocators;
import object_locators.TuteePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseTest;

import java.time.Duration;


public class TuteePage extends BaseTest {

    private LandingPageLocators landingPageLocators;
    TuteePageLocators tuteePageLocators;
    public TuteePage() {

        landingPageLocators = new LandingPageLocators();
        tuteePageLocators = new TuteePageLocators();
    }

    public void HomeSearch(String tutorName, String dropdownPartialOption)
    {
        WebElement searchBox = driver.findElement(By.xpath(landingPageLocators.getLocator("txtHomeSearch")));
        searchBox.sendKeys(tutorName);

        // Wait for the autocomplete dropdown to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By dropdownItemLocator = By.cssSelector("div.page-header.header-filter.clear-filter:nth-child(5) " +
                "div.container div.row div.col-md-12.ml-auto.mr-auto.intro-section" +
                " div.brand div.row:nth-child(3) div.col-lg-8.centered-form div.card.shadowcard" +
                " div.card-body div.col-12 span.twitter-typeahead div.tt-menu:nth-child(4) " +
                "div.tt-dataset.tt-dataset-home > li.autcomplete.item.tt-suggestion.animated." +
                "fadeIn.tt-selectable:nth-child(1)" + dropdownPartialOption + "')]");

        wait.until(ExpectedConditions.presenceOfElementLocated(dropdownItemLocator));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void clickTutorName(String tutorName) {
        WebElement tutorLink = driver.findElement(By.linkText(tutorName));
        tutorLink.click();
    }

        public void clickRequestLesson()
        {
            BaseTest.driver.findElement(By.xpath(tuteePageLocators.getLocator("btnReqLesson"))).click();
        }


}
