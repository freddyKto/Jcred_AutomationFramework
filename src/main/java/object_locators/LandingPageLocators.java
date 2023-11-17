package object_locators;
import java.util.HashMap;

public class LandingPageLocators {

    private HashMap<String, String> Land_Page;

    public LandingPageLocators() {
        Land_Page = new HashMap<>();

        // Lading
        Land_Page.put("txtEmail", "//*[@id=\"mat-input-0\"]");
        Land_Page.put("txtPassword", "//input[@data-placeholder='Password']");
        Land_Page.put("btnLogin", "(//span[@class='mat-button-wrapper'])[1]");

    }


    public String getLocator(String key) {
        return Land_Page.get(key);


    }
}

