package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestAlert extends Utility {
    String baseUrl ="https://mail.rediff.com/cgi-bin/login.cgi";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    public void one(){
        clickOnElement(By.xpath("//input[@title='Sign in']")); //Click on sign in button
        Alert alert = driver.switchTo().alert(); //Creating alert objcet reference and switch to alert
        alert.accept(); //accepting Alert

    }

}
