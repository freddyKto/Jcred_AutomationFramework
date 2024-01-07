package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import utils.Utils;
import static utilities.BaseTest.driver;

@Listeners(utilities.Listeners.class)
public class PersonRecordsPage {

    Utils webDriverUtils;

    public PersonRecordsPage() {
        this.webDriverUtils = new Utils(driver);
    }
    public void personTrace() {
        System.out.println("Person trace search");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"P\"]"));
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-menu-panel-11\"]/div/button[1]"));

    }

        public void personTracebyName () {


            logStep("Entering reference: PersonTracebyName");
            webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "PersonTracebyName");

            webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
            webDriverUtils.clickElement(By.xpath("(//span[@class='mat-option-text'])[1]"));

            webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
            webDriverUtils.clickElement(By.xpath("//span[text()=' Name ']"));

            webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='firstname']"),"Freddy");
            webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='surname']"),"Konyane");
            webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='age']"),"25");
            webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='year']"),"1998");

            // terms and conditions checks
            webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
            webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
            webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

            webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
            webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

            webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

            // Perform search
            webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));

    }


    public void personTracebyID(){

        System.out.println("Performing person trace by ID number ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "PersonTracebyIDnumber");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("(//span[@class='mat-option-text'])[1]"));

        webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' ID Number ']"));


        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='idnumber']"),"9808196131087");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));

    }

    public void personTracebyPassport(){

        System.out.println("Performing person trace by passport ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "QA_testing");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("(//span[@class='mat-option-text'])[1]"));

        webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Name ']"));


        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='firstname']"),"9883297437393");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));

    }


    public void personTracebyContactNo(){
        System.out.println("Performing person trace by contact number ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "personTracebyContactNo");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("(//span[@class='mat-option-text'])[1]"));

        webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Contact Number ']"));


        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='contactNumber']"),"0722717331");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));
    }


    public void personVerbyName(){
        System.out.println("Performing person Verification by name ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "PersonVerbyName");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Person Verification ']"));

        webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Name ']"));


        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='firstname']"),"Thoriso");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='surname']"),"rangata");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));

        // Viewing more
        webDriverUtils.clickElement(By.xpath("//*[@id=\"ViewMore\"]/span[1]"));
    }


    public void personVerbyID(){
        System.out.println("Performing person verification by IdNo ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "PersonVerbyIdNO");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' Person Verification ']"));

        webDriverUtils.clickElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-34']"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' ID Number ']"));


        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='idnumber']"),"9808196131087");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));
    }

    public void IdPhoto_verification(){
        System.out.println("Performing ID photo verification by name ");
        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='reference']"), "QA_testing");
        webDriverUtils.clickElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' ID Photo Verification ']"));

        webDriverUtils.sendKeys(By.xpath("//input[@formcontrolname='idnumber']"),"9808196131087");

        // terms and conditions checks
        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
        webDriverUtils.clickElement(By.xpath("//input[@id='r5']"));
        webDriverUtils.clickElement(By.xpath("//button[contains(@class,'mat-focus-indicator acceptBtn')]"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
        webDriverUtils.clickElement(By.xpath("//span[text()=' I Accept ']"));

        webDriverUtils.checkCheckbox(By.xpath("(//span[@class='mat-checkbox-inner-container'])[3]"));

        // Perform search
        webDriverUtils.clickElement(By.xpath("//span[text()=' Perform Search ']"));
    }

    private void logStep(String message) {
        System.out.println("Step: " + message);
    }

}



