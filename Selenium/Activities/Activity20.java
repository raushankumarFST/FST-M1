package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity20 {
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();
        Alert promtAlert = driver.switchTo().alert();

        String alertText = promtAlert.getText();
        System.out.println("Text in alert box is: " + alertText);

        promtAlert.sendKeys("Alert message test");

        promtAlert.accept();

        driver.quit();
    }
}