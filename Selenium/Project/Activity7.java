package projectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();   
        
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test 
   public void HeaderTest3() {
    	
    	driver.findElement(By.xpath("//*[@id=\"menu-item-1508\"]")).click();
    	
    	List<WebElement> listwebelement = driver.findElements(By.cssSelector("div.ld_course_grid.col-sm-8.col-md-4"));
        int i=0;
        for (WebElement Element : listwebelement) {
            i = i+1;
            System.out.println(Element.getText());
        }
        System.out.println("Total Number of Courses on the page: " + i);
   
}    
}    