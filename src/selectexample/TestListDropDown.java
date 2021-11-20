package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestListDropDown extends Utility {

        String baseUrl ="https://www.expedia.co.uk/";
        @Before
        public void setBaseUrl(){
            openBrowser(baseUrl);
            clickOnElement(By.xpath("//button[@class='osano-cm-accept-all osano-cm-buttons__button osano-cm-button osano-cm-button--type_accept']"));
        }
        @Test
        public void dropDownExampleWithList(){
            clickOnElement(By.id("//input[@id='location-field-destination']"));
            List<WebElement> productType = driver.findElements(By.xpath("//button[@aria-label='Going to']"));
            for (WebElement product : productType) {
                if(product.getText().equalsIgnoreCase("Lhr")){
                    product.click();
                }
            }

            }
        }

