package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://v1.training-support.net");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		System.out.println(driver.getTitle());
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

		driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
		
		String message= driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("LogIn message: " + message );
		
		driver.quit();

	}

}
