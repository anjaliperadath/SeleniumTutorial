package uiComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver = new ChromeDriver();
		
		/**
		 * 
		 * Implicit wait
		 * 1. Global wait- applied to each element
		 * 2. wait until defined time limit
		 * 3. if element displayed before time limit it will not wait unlike Thread.sleep()
		 */	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Implicit wait 
		
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.findElement(By.cssSelector("#save")).click(); // to click on "Get New User" button
	
		String name=driver.findElement(By.cssSelector(".card-title")).getText();// to get the text (here name of the person) of card title
		//we gave datatype as string as "getText()" returns string value
		System.out.println(name);	
		
		// Explicit wait
		driver.findElement(By.id("progress-bars")).click();//to click on Progress bar field
		driver.findElement(By.id("downloadButton")).click();// To click on "Start Download" button
		
		WebElement widgetText= driver.findElement(By.cssSelector(".progress-label"));
		System.out.println(widgetText.getText());//to get the text "Starting download" text that appears first when we click "Start download".
		//to know whether it started downloading 
		/**
		 * Explicit wait
		 * defined for explicit behavior of an element
		 * 
		 */
		
		//We want to wait until the text "complete" comes only upon finishing download and get the text below 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.textToBePresentInElement(widgetText, "Complete!"));
		//widgetText is the element and "Complete!" is till what value should wait
		
		WebElement btn=driver.findElement(By.cssSelector(".ui-dialog-buttonset button"));// to locate the "close" button
		//".ui-dialog-buttonset" is the class and "button" is the type just to specify
		
		System.out.println(driver.findElement(By.cssSelector(".progress-label")).getText());
		//to get the text "Complete!" as now it has waited till the end
		
        System.out.println(btn.getText()); //to get the text "Close" as in "btn" the location of close button is there
        btn.click();// to click on "close" button
		
		driver.quit();
	}
}
