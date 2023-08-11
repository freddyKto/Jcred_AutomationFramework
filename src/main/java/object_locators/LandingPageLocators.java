package object_locators;
import java.util.HashMap;

public class LandingPageLocators {

    private HashMap<String, String> Land_Page;

    public LandingPageLocators() {
        Land_Page = new HashMap<>();

        // Lading
        Land_Page.put("txtHomeSearch", "//*[@id=\"homeText\"]");
        Land_Page.put("btnRunBursary", "//a[contains(text(),'Click here if you run a bursary')]");
        Land_Page.put("btbLogo", "//*[@id=\"sectionsNav\"]/div/div[1]/a/img");
        Land_Page.put("btnWorkshops", "//a[contains(text(),'Workshops')]");
        Land_Page.put("btnAboutUs", "//*[@id=\"sectionsNav\"]/div/div[2]/ul/li[2]/a");

        // registration form
        Land_Page.put("btnTuteeSignUp", "//a[contains(text(),'Tutee Sign Up')]");
        Land_Page.put("btnTutorSignUp", "//a[contains(text(),'Tutor Sign Up')]");
        Land_Page.put("txtTuteeFname", "//input[@id='fName']");
        Land_Page.put("txtTuteeSname", "//input[@id='sName']");
        Land_Page.put("txtRace", "//select[@id='raceslst']");
        Land_Page.put("btnPrevious", "//button[@id='prevBtn']");
        Land_Page.put("btnNext", "//button[@id='nextBtn']");
        Land_Page.put("txtInstitution", "//select[@id='sa']");
        Land_Page.put("txtEmail", "//input[@id='emailId']");
        Land_Page.put("txtContactNo", "//input[@id='cNumber']");
        Land_Page.put("txtSpoken", "");
        Land_Page.put("txtWritten", "");

        // Drop down
        Land_Page.put("selectSupport", "//a[contains(text(),'Support')]");
        Land_Page.put("btnTermsConditions", "//*[@id=\"sectionsNav\"]/div/div[2]/ul/li[3]/div/a[1]");
        Land_Page.put("btnFaq", "//i[contains(text(),'layers')]");
        Land_Page.put("btnContactUS", "//i[contains(text(),'content_paste')]");

        // login form
        Land_Page.put("btnLogin", "nav.navbar.navbar-color-on-scroll.navbar-transparent." +
                "fixed-top.navbar-expand-lg:nth-child(4) div.container div.collapse.navbar-collapse ul.navbar-nav.ml-auto ul" +
                ".navbar-nav.nav.secondary:nth-child(4) li.cta:nth-child(1) > a.btn.btn-success.mar-5.nav-link");

        Land_Page.put("txtEmailAddressLogin", "//input[@type=\"email\"]");
        Land_Page.put("txtPasswordLogin", "//*[@id=\"inputPassword\"]");
        Land_Page.put("btnForgotPassword", "//a[contains(text(),'Forgot password?')]");
        Land_Page.put("btnLoginLogin", "div.body-content:nth-child(2) div.col-md-8:nth-child(2)" +
                      " div.main.main-raised.col-xs-10.col-sm-10.col-md-10.col-lg-10.centered-form " +
                      "div.col-md-10 fieldset:nth-child(4) form:nth-child(1) div.row:nth-child(4) div.col-lg-12 >" +
                      " input.btn.btn-primary:nth-child(1)");
    }


    public String getLocator(String key) {
        return Land_Page.get(key);


    }
}

