import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptExmple {

    public static void main(String[] args) {

        //Create a instance of ChromeOptions class
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable -notification"); //Disable browser notification
     options.addArguments("--incognito"); //Open Browser in private window
      // options.addArguments("--headless");  //Open headless browser

        //Add chrome switch to disable notification - "**--disable-notifications**"

        String baseUrl= "https://www.justdial.com/Bangalore/Bakeries\n";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // driver.switchTo().alert().dismiss();
    }
}
