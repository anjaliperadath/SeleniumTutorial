package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();     //click Ctrl+shift+o to import WebDriver and ChromeDriver
		/*
		 * 1. ID
		 * 2. name
		 * 3. ClassName
		 * 4. partialLinktext
		 * 5. Linktext
		 */
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //click Ctrl+shift+o to import By
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click(); // click as it is to click login button
		driver.findElement(By.id("react-burger-menu-btn")).click();//to click the button on left side 
		
		Thread.sleep(2000);////to give a 2 sec wait in case system is slow , to see the execution .
		// when thread is given it might throw an exception in that time so we gave InterruptedException in main method
		driver.findElement(By.linkText("About")).click();// as "about" leads to a link ie a new page(to access link)
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();//as inside it logout option is present
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Logo")).click();// to access link by typing a portion of their link text,ie here to logout
		driver.quit();

	}
}
