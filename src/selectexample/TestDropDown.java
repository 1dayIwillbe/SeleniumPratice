package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

public class TestDropDown extends Utility {
    String baseUrl ="http://way2automation.com/way2auto_jquery/index.php";
    @Before
    public void setBaseUrl(){
        openBrowser(baseUrl);
    }
    @Test
    public void one(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
       Select select = new Select(dropdown);
       selectByVisibleTextFromDropDown(By.xpath("//select[@name='country']"),"India");
       // select.selectByVisibleText("Bosnia and Herzegowina");
      // select.selectByValue("India");
      /// select.selectByIndex(4);
      List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement option :allOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
            }
        }

        }



    public void selectByVisibleTextFromDropDown(By by,String text){
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }

}
