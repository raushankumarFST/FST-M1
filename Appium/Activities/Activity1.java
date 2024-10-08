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

public class Activity1 {

	AppiumDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options caps = new UiAutomator2Options().setPlatformName("andriod")
				.setAutomationName("UiAutomator2").
				setAppPackage("com.coloros.calculator").
				setAppActivity("com.android.calculator2.Calculator").
				noReset();
		
		URL serverURL = new URI("http://localhost:4723").toURL();
		
		driver = new AndroidDriver(serverURL,caps);
		
	}
	
	@Test
	public void additionTest() {
		
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_6")).click();
		driver.findElement(AppiumBy.accessibilityId("Add")).click();
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_9")).click();
		driver.findElement(AppiumBy.accessibilityId("Equals")).click();

		String result = driver.findElement(AppiumBy.id("result")).getText();
		System.out.println("Result is: "+result);
		Assert.assertEquals(result, "15");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}