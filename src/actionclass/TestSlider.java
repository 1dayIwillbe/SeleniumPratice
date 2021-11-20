package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestSlider extends Utility {
    String baseUrl ="https://jqueryui.com/resources/demos/slider/default.html";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    public void sliderExample(){

        Actions actions = new Actions(driver);
        WebElement mainSlider = driver.findElement(By.id("slider"));
        int width = mainSlider.getSize().width;
        int halfWidth = width /2;

        WebElement slider = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
        actions.dragAndDropBy(slider,halfWidth,0).build().perform();

    }
}