package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/select-input.php");
		
		/**
		 * 1. Create an object for select class
		 * 2. use that object to select options from dropdown using
		 *    below methods.
		 *
		 */
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Green");
		Thread.sleep(1000);
		select.selectByValue("Yellow");
		Thread.sleep(1000);
		select.selectByIndex(1);
		
		driver.quit();
		

	}

}
