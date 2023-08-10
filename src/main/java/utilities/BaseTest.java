package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class BaseTest {
        protected static WebDriver driver;

        public LandingPage landingPage;



         @BeforeMethod(alwaysRun=true)
         public void launchApplication() {
             driver = DriverManager.getDriver("chrome");
             landingPage = new LandingPage(driver);
             landingPage.goTo();
        }

         @AfterMethod(alwaysRun=true)
         public void tearDownMain() {
             DriverManager.closeDriver();
         }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
            FileUtils.copyFile(source, file);
            return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

        }


    }


