package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity5 {
	
	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options caps = new UiAutomator2Options().setPlatformName("andriod")
				.setAutomationName("UiAutomator2").setAppPackage("com.google.android.apps.messaging")
				.setAppActivity(".ui.ConversationListActivity").noReset();

		URL serverURL = new URI("http://localhost:4723").toURL();

		driver = new AndroidDriver(serverURL, caps);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));


	}
	
	@Test
	public void messageTest() {
		
		driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id=\"com.google.android.apps.messaging:id/recipient_text_view\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id=\"com.google.android.apps.messaging:id/recipient_text_view\"]")).sendKeys("Raushan Kumar");
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/contact_name\" and @text=\"Raushan Kumar\"]")).click();
		 
		 driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Hi Raushan");
		 driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
	 
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}