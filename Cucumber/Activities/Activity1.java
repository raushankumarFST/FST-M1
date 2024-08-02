package stepDefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity1 {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setup() {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Given("User is on the DuckDuckGo website")
	public void user_is_on_DDG_website() {
		driver.get("https://duckduckgo.com/");
		assertEquals("DuckDuckGo — Privacy, simplified.", driver.getTitle());
	}
	
	@When("User searches for cheese")
	public void user_searches_for_cheese() {
		driver.findElement(By.id("searchbox_input")).sendKeys("Cheese");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Then("User should see search results")
	public void user_should_see_search_results() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".react-results--main")));
		WebElement results= driver.findElement(By.cssSelector(".react-results--main"));
		assertNotNull(results);
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
}
