package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");
		System.out.println(driver.getTitle());
		
		String HeaderText=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third heading text is: "+HeaderText);
		
		String HeaderTextColor= driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
		System.out.println("Fifth Header text color is: "+HeaderTextColor);
		
		String voiletButtonClass= driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
		System.out.println("Violet button classes are: "+voiletButtonClass);
		
		String GreyButtonText= driver.findElement(By.xpath("//button[text()='Grey']")).getText();
		System.out.println("Grey button text is: "+GreyButtonText);
		
		driver.quit();
		

	}

}
