package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestIFrame extends Utility {

        String baseUrl ="https://courses.letskodeit.com/practice";
        @Before
        public void setBaseUrl(){
            openBrowser(baseUrl);
        }
        @Test
        public void switchIFrame() throws InterruptedException{
            //switch to iframe
            driver.switchTo().frame("courses-iframe");
            //find the element inside the iframe and send the text
            sendTextToElement(By.xpath("//input[@id='search']"),"Prime Testing");
            //Switch to default content
            driver.switchTo().defaultContent();

            //send Text to search box (outside the frame)
            Thread.sleep(3000);
            sendTextToElement(By.id("name"),"Jignesh");
        }

}
