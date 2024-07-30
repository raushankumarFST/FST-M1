package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement inputBox= driver.findElement(By.id("input-text"));
		System.out.println("Text Field is Visible on the page: " + inputBox.isDisplayed());
		
		System.out.println("Text Field is enable on the page: " + inputBox.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Text Field is enable on the page: " + inputBox.isEnabled());
		
		driver.close();

	}

}
