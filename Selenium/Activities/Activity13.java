package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/tables");
		System.out.println(driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println("Number of rows in the given table: " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println("Number of columns in the given table: " + cols.size());
		
		List<WebElement> rows3 = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		System.out.println("Cell values in the third row of the table: ");
		for(WebElement cell : rows3) {
            System.out.println(cell.getText());
        }
		
		WebElement cols2= driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Cell values in the 2nd row of 2nd column in the table: " + cols2.getText());
		
		driver.close();
	}

}
