package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //  driver.switchTo().alert().dismiss();

        //id and name locators
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.click();
        searchBox.sendKeys("T-Shirt");
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        driver.findElement(By.partialLinkText("Summer")).click();
        driver.findElement(By.xpath("//input[@id='search_query_top'] and //input[@name ='search_query']")).sendKeys("T-shirt");

        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-Shirt");
        driver.findElement(By.linkText("Submit")).click();
        driver.findElement(By.linkText("List")).click();
        driver.findElement(By.linkText("About us")).click();
        // xpath with OR
        driver.findElement(By.xpath("//input[@id = 'search_query_top' or @placeholder='Search']")).sendKeys("T-shirt");

        // xpath with and
        driver.findElement(By.xpath("//input[@id = 'search_query_top' and @placeholder='Search']")).sendKeys("T-shirt");

        // xpath with contains()
        driver.findElement(By.xpath("//input[contains(@id, 'top')]"));

        // xpath with start-with
        driver.findElement(By.xpath("//input[starts-with(@id, 'search_query')]"));

        // xpath with text()
        driver.findElement(By.xpath("//a[text()='Women']")).sendKeys("T-shirt");

        // xpath chained
        driver.findElement(By.xpath("//form[@id='searchbox']//button[@name = 'submit_search']")).click();


    }

}

