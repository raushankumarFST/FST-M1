package projectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
            
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    
    @Test 
   public void HeaderTest3() {
  
    	WebElement image_link = driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']"));
    	Assert.assertEquals(image_link.getText(), "Email Marketing Strategies");
        System.out.println("The title of second most popular course is: " + image_link.getText());
    }
    @AfterTest(alwaysRun = true)
    public void afterMethod() {

        driver.close();
    }
}