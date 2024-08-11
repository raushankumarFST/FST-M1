package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
	AppiumDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options caps = new UiAutomator2Options().setPlatformName("andriod")
				.setAutomationName("UiAutomator2").setAppPackage("com.vivo.calculator")
				.setAppActivity(".Calculator").noReset();

		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, caps);

	}

	@Test(priority=1)
	public void addTest() {

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("Plus")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_9")).click();
		String result = driver.findElement(AppiumBy.id("com.vivo.calculator:id/result")).getText();
		driver.findElement(AppiumBy.accessibilityId("Clear")).click();
		System.out.println("Result of 5 + 9 is: " + result);
		Assert.assertEquals(result, "14");
	}

	@Test(priority=2)
	public void subTest() {

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("Minus")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_5")).click();
		String result = driver.findElement(AppiumBy.id("com.vivo.calculator:id/result")).getText();
		driver.findElement(AppiumBy.accessibilityId("Clear")).click();
		System.out.println("Result of 10 - 5 is: " + result);
		Assert.assertEquals(result, "5");
	}

	@Test(priority=3)
	public void mulTest() {

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_5")).click();

		driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_0")).click();
		String result = driver.findElement(AppiumBy.id("com.vivo.calculator:id/result")).getText();
		driver.findElement(AppiumBy.accessibilityId("Clear")).click();
		System.out.println("Result of 5 * 100 is: " + result);
		Assert.assertEquals(result, "500");
	}

	@Test(priority=4)
	public void divTest() {

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("Divide")).click();
		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_2")).click();

		String result = driver.findElement(AppiumBy.id("com.vivo.calculator:id/result")).getText();
		driver.findElement(AppiumBy.accessibilityId("Clear")).click();
		System.out.println("Result of 50 / 2 is: " + result);
		Assert.assertEquals(result, "25");
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}

}