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

public class Activity8 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();   
        
        driver.get("https://alchemy.hguy.co/lms");
        
        driver.findElement(By.xpath("//*[@id=\"menu-item-1506\"]")).click();
        
    	WebElement page_title = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        Assert.assertEquals(page_title.getText(), "Need Help?");
        System.out.println("On Contact Page: " + page_title.getText());
        System.out.println("Filling the contact form fields (Full Name, email, etc.) ");
    }
    
    
    @Test 
   public void ContactAdmin() {
    	
    	WebElement Name = driver.findElement(By.id("wpforms-8-field_0"));
    	Name.sendKeys("Admin");
    	
    	WebElement Email = driver.findElement(By.id("wpforms-8-field_1"));
    	Email.sendKeys("abc@xyz.com");
    	
    	WebElement Subject = driver.findElement(By.id("wpforms-8-field_3"));
    	Subject.sendKeys("Project activity 8");
    	
    	WebElement Message = driver.findElement(By.id("wpforms-8-field_2"));
    	Message.sendKeys("Comment box message");
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
    	
    	WebElement page_title = driver.findElement(By.xpath("//*[@id=\"wpforms-confirmation-8\"]"));
        Assert.assertEquals(page_title.getText(), "Thanks for contacting us! We will be in touch with you shortly.");
        System.out.println("Message Confirmation: " + page_title.getText());
}
    
	@AfterTest(alwaysRun = true)
    public void afterMethod() {

       driver.close();
    }  
	
}