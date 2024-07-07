package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");

		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
		String message= driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("LogIn message: " + message );
		
		driver.quit();
	}

}
