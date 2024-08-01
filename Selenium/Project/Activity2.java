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

public class Activity2 {
    WebDriver driver;
    
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
            
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    
    @Test 
    public void HeaderTest1() {
        WebElement header1 = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        Assert.assertEquals(header1.getText(), "Learn from Industry Experts");
        System.out.println("Page header title is: " + header1.getText());
    }
    @AfterTest(alwaysRun = true)
    public void afterMethod() {

        driver.close();
    }
}