package utilities;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import PageObjects.LandingPage;

import java.io.File;
import java.io.IOException;



public class BaseTest {
        public static WebDriver driver;

        public LandingPage landingPage;



         @BeforeClass(alwaysRun=true)
         public void launching_application(){
             System.out.println("Setting up the WebDriver and launching the application...");
             driver = DriverManager.getDriver("chrome");
             landingPage = new LandingPage(driver);
             landingPage.goTo();
        }

         @AfterClass(alwaysRun=true)
         public void tearDownMain() {
             System.out.println("Tearing down the WebDriver and closing the application...");
//            DriverManager.closeDriver();
         }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
            System.out.println("Capturing screenshot for test: " + testCaseName);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
            FileUtils.copyFile(source, file);
            return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

        }


    }


