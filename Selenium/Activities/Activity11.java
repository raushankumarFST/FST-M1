package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Is CheckBox selected on the page: " + checkBox.isSelected());
		
		checkBox.click();
	
		System.out.println("Is CheckBox selected on the page: " + checkBox.isSelected());
		
		driver.close();

	}

}
