package projectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {
    WebDriver driver;
   
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
            
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    
    @Test 
    public void pageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Home page title is: " + title);
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
        System.out.println("Home page title: " + driver.getTitle());
    }
    @AfterTest(alwaysRun = true)
    public void afterMethod() {

        driver.close();
    }
}