package locator;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorDemo5 extends BaseTest {
    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }

    @Test
    public void textXpathAxis() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // it will wait till page completely load
        driver.manage().window().maximize();
        //
        String text = driver.findElement(By.xpath("//a[contains(text(),'SBI')]")).getText();
        System.out.println(text);
        //Parent - Select the parent of current node (always one)
        String text2 = driver.findElement(By.xpath("//a[contains(text(),'SBI')]/parent::td")).getText();
        System.out.println(text2);
        //child -Select all children of currnet node(one or many)
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/child::td"));
        System.out.println("number of child element :" + childs.size());

        //Acestor - Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr")).getText();
        System.out.println(text);
        //Descendant -Select al decendants (children, grand children,etc)
        List<WebElement> descendent = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/descendant::*"));
        System.out.println("number of child element :" + descendent.size());

        //following -Select everything in documents after the closing tag of the current node
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'SBI')]//ancestor::tr/following::tr"));
        System.out.println("number of following element :" + following.size());

        // Following-sibling Selects all siblings after the current node
        List<WebElement> following1 = driver.findElements(By.xpath("//a[contains(text(),'SBI')]//ancestor::tr/following::tr"));
        System.out.println("number of following element :" + following.size());
                //a[contains(text(),'SBI')]//ancestor::tr/following-sibling::tr
        // Preceding - Selects all nodes that appear before the current node in the document
                //a[contains(text(),'SBI')]//ancestor::tr/preceding::tr
        // Preceding-sibling - Select all siblings before the current node
                //a[contains(text(),'SBI')]//ancestor::tr/preceding-sibling::tr

    }

    @After
    public void closeDown() {
        closeBrowser();

    }
}

