package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


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
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Freddy\\Desktop\\Automation Workspace\\Selenium framework\\drivers\\chromedriver.exe");
                chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--incognito");



                return new ChromeDriver(chromeOptions);
            case "firefox":
                System.setProperty("web-driver.gecko.driver", "path/to/geckodriver");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                return new FirefoxDriver(firefoxOptions);

            case "ie":
                System.setProperty("web-driver.ie.driver", "path/to/IEDriverServer.exe");
                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
                ieOptions.ignoreZoomSettings();
                return new InternetExplorerDriver(ieOptions);

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
