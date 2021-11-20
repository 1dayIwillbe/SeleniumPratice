package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationExample {
    /**
     * navigation().back()
     * navigation().forward()
     * navigation().refresh()
     * navigation().to()
     */

    public static void main(String[] args) {
        String baseUrl= "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());
        driver.getCurrentUrl(); // to get url of current page.

        driver.get(baseUrl); // it will wait till page completely load
        driver.navigate().to("https://www.amazon.co.uk/\n"); // using this method does not wait until page load

        driver.navigate().back();  // navigate back in web browser
        driver.navigate().forward();  // forward to amazon.

        driver.navigate().refresh(); // this will refresh the page
    }
}
