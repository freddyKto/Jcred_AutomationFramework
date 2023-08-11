package utilities;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.LandingPage;

import java.io.File;
import java.io.IOException;



public class BaseTest {
        protected static WebDriver driver;

        public LandingPage landingPage;



         @BeforeClass(alwaysRun=true)
         public void launchApplication() {
             driver = DriverManager.getDriver("chrome");
             landingPage = new LandingPage(driver);
             landingPage.goTo();
        }

         @AfterClass(alwaysRun=true)
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


