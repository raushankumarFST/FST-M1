package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		System.out.println(driver.getTitle());
		
		WebElement FootBall= driver.findElement(By.id("draggable"));
		WebElement DropZone1= driver.findElement(By.id("droppable"));
		WebElement DropZone2= driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(FootBall).moveToElement(DropZone1).pause(2000).release().build().perform();
		String VerifyDropZone1= driver.findElement(By.tagName("p")).getText();
	    if(VerifyDropZone1.equals("Dropped!")) {
	    	String BallDropped1= driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
	    	System.out.println("Ball " +BallDropped1+" in DropZone1");
	    }
		builder.clickAndHold(FootBall).moveToElement(DropZone2).pause(2000).release().build().perform();
		String VerifyDropZone2= driver.findElement(By.tagName("p")).getText();
		if(VerifyDropZone2.equals("Dropped!")) {
	    	String BallDropped2= driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
	    	System.out.println("Ball " +BallDropped2+" in DropZone2");
	    }
		
		driver.quit();
		
	}

}
