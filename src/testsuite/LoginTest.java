package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredential() {
        clickOnElement(By.xpath("//a[normalize-space()='Log in']"));
        clickOnElement(By.xpath("//input[@id='Email']"));
        sendTextToElement(By.id("Email"), "one123@gmail.com");
        sendTextToElement(By.id("Pasword"), "hello123");
        clickOnElement(By.xpath("//button[normalize-space()='Log in']"));
        String expectedMessage = "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//li[normalize-space()='No customer account found']")).getText();
        Assert.assertEquals("error message is not displayed,", expectedMessage);
    }

    @After
    public void teardown() {
        closeBrowser();
    }


}


