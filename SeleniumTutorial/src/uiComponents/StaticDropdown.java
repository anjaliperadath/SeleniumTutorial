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
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']")); // to locate dropdown using xpath
		Select select = new Select(dropdown);// created object for the select class and add argument(dropdown).
		select.selectByVisibleText("Green");// to select by text
		Thread.sleep(1000);//to wait for 1 second, so that we can see the transition from green to yellow
		select.selectByValue("Yellow");// to select by value
		Thread.sleep(1000);
		select.selectByIndex(1);// to select by index 		
		driver.quit();		

	}
}
