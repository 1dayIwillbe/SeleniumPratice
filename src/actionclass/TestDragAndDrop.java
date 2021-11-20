package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestDragAndDrop extends Utility {
    String baseUrl ="https://jqueryui.com/resources/demos/droppable/default.html";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    public void drageAndDropExaple(){
        Actions action = new Actions(driver);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        action.dragAndDrop(draggable,droppable).build().perform();

    }
}
