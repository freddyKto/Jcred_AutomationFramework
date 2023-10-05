package object_locators;
import java.util.HashMap;

public class TuteePageLocators {

    private HashMap<String, String> TuteeDashboard_page;

    public TuteePageLocators() {
        TuteeDashboard_page = new HashMap<>();

        TuteeDashboard_page.put("btnReqLesson", "//*[@id=\"reqLesson\"]");
        TuteeDashboard_page.put("dropdownCourse", "//select[@title='Course is required']");
        TuteeDashboard_page.put("dropdownLength", "//label[text()='Lesson Length']/following-sibling::select");

        TuteeDashboard_page.put("dropdownLocation", "(//select[@id='sa'])[2]");
        TuteeDashboard_page.put("dropdownAlternateLocation", "(//select[@id='sa'])[3]");
        TuteeDashboard_page.put("datePicker", "(//label[text()='Date']/following::input)[1]");
        TuteeDashboard_page.put("timeOfTheDay", "(//label[text()='Time Of Day']/following-sibling::select)[1]");
        TuteeDashboard_page.put("alternateDate", "//input[@placeholder='Alternate Lesson Date']");
        TuteeDashboard_page.put("alternate_timeOfTheDay", "(//label[text()='Time Of Day']/following-sibling::select)[2]");
        TuteeDashboard_page.put("AreaOfDiff", "(//textarea[@class='form-control contact-comments'])[1]");
        TuteeDashboard_page.put("LessonExpectation", "//textarea[@placeholder='What do you want to get out of the session?']");
        TuteeDashboard_page.put("YouBursaryProvider", "(//input[@type='number'])[1]");
        TuteeDashboard_page.put("btnSubmitReq", "//button[@data-bind='click: $root.tutorRequestByUser']");
    }

    public String getLocator(String key) {
        return TuteeDashboard_page.get(key);

    }
}
