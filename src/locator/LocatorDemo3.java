package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
      //CSS Locator
        WebElement singInLink = driver.findElement(By.linkText("Sign in"));
        singInLink.click();
        //Tag and id
        WebElement emailField = driver.findElement(By.cssSelector("input#email"));
        emailField.sendKeys("prime@gmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("#passwd"));
        passwordField.sendKeys("Hello123");
         //Tag and Class
        WebElement signInBtn =driver.findElement(By.cssSelector("p.submit"));
        signInBtn.click();

      //  //Tag and Attibute
      //   WebElement emailField1 = driver.findElement(By.cssSelector("input[id =email]"));
      // emailField1.sendKeys("Prime1");
    }
}

