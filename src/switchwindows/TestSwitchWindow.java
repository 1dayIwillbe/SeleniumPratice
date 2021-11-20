package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

public class TestSwitchWindow extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() throws Exception {

        //Get the handle of window
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Window :" + parentHandle);
        clickOnElement(By.id("openwindow"));
        String childHandle = driver.getWindowHandle();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();


        //Switching between handles
        for (String handle :handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
                driver.close();
                break;
                }
        }

    }

}
