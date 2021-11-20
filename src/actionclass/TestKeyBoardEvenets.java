package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestKeyBoardEvenets extends Utility {
    String baseUrl ="https://courses.letskodeit.com/practice";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test

    public void keyBoardExample() throws InterruptedException {
        Actions action = new Actions(driver);
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL+"a");
        Thread.sleep(3000);
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        clickOnElement(By.id("name"));
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
    }
}
