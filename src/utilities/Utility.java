package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     * @param by
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from elemnets
     * @param by
     */
    public String getTextFromElement(By by) {
        WebElement message = driver.findElement(by);
        return message.getText();

    }

    /**
     * This method will send text on elements
     * @param by
     * @param text
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }



}
