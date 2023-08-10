package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
        if (browserName.equalsIgnoreCase("chrome")) {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            return new ChromeDriver(chromeOptions);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            return new InternetExplorerDriver();
        }
        return null;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
