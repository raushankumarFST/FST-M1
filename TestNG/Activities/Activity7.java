package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");

	}

	@DataProvider(name = "Credentials")
	public static Object[][] creds() {
		return new Object[][] {{ "admin","password","Welcome Back, admin" },
				{ "wrongadmin", "wongpassword", "Invalid Credentials" } };
	}

	@Test(dataProvider = "Credentials")
	public void loginTest(String username, String password, String expectedMessage) {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		usernameField.clear();
		passwordField.clear();

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

		String confirmationMessage = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(confirmationMessage, expectedMessage);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
