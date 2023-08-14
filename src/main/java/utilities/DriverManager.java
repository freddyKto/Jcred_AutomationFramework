package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverManager {

    private static WebDriver driver;
    private static ChromeOptions chromeOptions;

    public static WebDriver getDriver(String browserName) {
        if (driver == null) {
            driver = createDriver(browserName);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        return driver;
    }

    private static WebDriver createDriver(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("incognito");

                return new ChromeDriver(chromeOptions);
            case "firefox":

                return new FirefoxDriver();
            case "ie":
                return new InternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
