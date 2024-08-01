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

public class Activity5 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    
    
    @Test 
   public void HeaderTest3() {
    	driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]")).click();
    	
    	WebElement page_title = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        Assert.assertEquals(page_title.getText(), "My Account");
        System.out.println("Page Title is: " + page_title.getText());
    }

	@AfterTest(alwaysRun = true)
    public void afterMethod() {

        driver.close();
    }
}