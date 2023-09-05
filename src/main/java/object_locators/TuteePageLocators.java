package object_locators;
import java.util.HashMap;

public class TuteePageLocators {

    private HashMap<String, String> TuteeDashboard_page;

    public TuteePageLocators() {
        TuteeDashboard_page = new HashMap<>();

        TuteeDashboard_page.put("btnReqLesson", "//button[@id='reqLesson']");


    }

    public String getLocator(String key) {
        return TuteeDashboard_page.get(key);


    }
}
