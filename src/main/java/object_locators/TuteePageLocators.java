package object_locators;
import java.util.HashMap;

public class TuteePageLocators {

    private HashMap<String, String> TuteeDashboard_page;

    public TuteePageLocators() {
        TuteeDashboard_page = new HashMap<>();

        TuteeDashboard_page.put("btnReqLesson", "//*[@id=\"reqLesson\"]");
        TuteeDashboard_page.put("dropdownCourse", "//*[@id=\"saL\"]");
        TuteeDashboard_page.put("dropdownLength", "//*[@id=\"sa\"]");
        TuteeDashboard_page.put("dropdownLocation", "//*[@id=\"sa\"]");
        TuteeDashboard_page.put("dropdownAlternateLocation", "//*[@id=\"alternateLocation\"]");
        TuteeDashboard_page.put("datePicker", "//*[@id=\"datePicker\"]");
        TuteeDashboard_page.put("timeDropdown", "//*[@id=\"timeDropdown\"]");
        TuteeDashboard_page.put("alternateDate", "//*[@id=\"alternateDate\"]");
        TuteeDashboard_page.put("alternateTime", "//*[@id=\"alternateTime\"]");

    }

    public String getLocator(String key) {
        return TuteeDashboard_page.get(key);

    }
}
