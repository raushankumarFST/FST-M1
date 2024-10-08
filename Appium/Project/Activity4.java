package project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import activities.ActionBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {

	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options caps = new UiAutomator2Options().setPlatformName("andriod")
				.setAutomationName("UiAutomator2").setAppPackage("com.android.chrome")
				.setAppActivity("com.google.android.apps.chrome.Main").noReset();

		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, caps);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://v1.training-support.net/selenium");

	}

	@Test
	public void webAppTest() {
		Dimension dims = driver.manage().window().getSize();
		System.out.println("My Phone dimensions are : " + dims);

		Point start = new Point((int) (dims.getWidth() * 0.5), (int) (dims.getHeight() * 0.85));
		Point end = new Point((int) (dims.getWidth() * 0.5), (int) (dims.getHeight() * 0.6));
		wait.until(ExpectedConditions
				.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text=\"Get Started!\"]")));

		ActionBase.doSwipe(driver, start, end, 50);
		wait.until(ExpectedConditions
				.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text=\"To-Do List\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath(
				"//android.webkit.WebView[@text=\"Todo List\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")))
				.click();

		WebElement addTaskInput = driver.findElement(AppiumBy.xpath(
				"//android.webkit.WebView[@text=\"Todo List\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));

		WebElement addTaskButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Add Task\"]"));

		addTaskInput.sendKeys("Add tasks to list");
		addTaskButton.click();
		addTaskInput.sendKeys("Get number of tasks");
		addTaskButton.click();
		addTaskInput.sendKeys("Clear the list");
		addTaskButton.click();

		driver.findElement(AppiumBy.xpath(
				"//android.webkit.WebView[@text=\"Todo List\"]/android.view.View/android.view.View/android.view.View[3]"))
				.click();

		List<WebElement> tasksAdded = driver
				.findElements(AppiumBy.xpath("//android.widget.TextView[@text=\"Add more tasks to this list.\"]"));
		Assert.assertEquals(tasksAdded.size(), 0);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}