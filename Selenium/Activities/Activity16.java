package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity16 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		System.out.println("Home page title: " + driver.getTitle());

		WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
		WebElement confirmPassword = driver
				.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
		WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));

		userName.sendKeys("admin");
		password.sendKeys("test");
		confirmPassword.sendKeys("test");
		email.sendKeys("abc@xyz.com");

		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login message: " + loginMessage);

		driver.quit();
	}
}