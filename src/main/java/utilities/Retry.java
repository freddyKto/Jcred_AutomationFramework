package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {


     /*        this method decides how many times should test should run TestNG will
	 *         call this method every time a test is failed
	 *
     *         this method will return true every time when test needs to be retried
	 *         and false when it not
      */

    int counter = 0, attempt = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (counter < attempt) {
            counter++;
            return true;
        } else
            return false;
    }

}
