package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorDemo2 {
    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
        //Class name lockater
        List<WebElement> sliderList = driver.findElements(By.className("homeslider-container"));
        int size = sliderList.size();
        System.out.println(size);
        //tag name locator
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("Number of link :" +link.size());



    }
}

