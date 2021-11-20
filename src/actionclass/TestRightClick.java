package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestRightClick extends Utility {
    String baseUrl ="http://swisnl.github.io/jQuery-contextMenu/demo.html\n";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test

    public void rightClickExample(){
        Actions action = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        action.contextClick(button).build().perform();
        clickOnElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]")); //Click on copy button
        System.out.println(driver.switchTo().alert().getText()); //capture the text form alert
        driver.switchTo().alert().accept(); //close the alert

    }
}
