package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println("Home page title: " + driver.getTitle());
		
		WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Is CheckBox visible on the page: " + checkBox.isDisplayed());
		
		WebElement toggleButton= driver.findElement(By.id("toggleCheckbox"));
		toggleButton.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        System.out.println("Is CheckBox visible on the page: " + checkBox.isDisplayed());
        toggleButton.click();
        
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Is CheckBox visible on the page: " + checkBox.isDisplayed());
        checkBox.click();
        
        driver.close();
        
        
	}

}
