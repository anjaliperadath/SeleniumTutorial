package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	static WebDriver driver;// declare it as static as we use it in 2 methods

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement desiredElement = driver.findElement(By.cssSelector(".totalAmount"));// to find element "Total Amount Collected: 296"
		scrollToElement(desiredElement);//called the method to scroll to "Total Amount Collected: 296" 
		// the method is given last outside the main method.
		
		/**
		 * switch to frame by following ways 
		 * 1. By id or name 
		 * 2. By index (use id, name or WebElement as index might change , it is not consistent)
		 * 3. By WebElement
		 */

		// switching to frame through name
		driver.switchTo().frame("iframe-name"); // only if we switch to frame driver can interact with the WebElement inside the frame.
		
		/**
		 * switching to frame through WebElement
		 * WebElement frameWebElement = driver.findElement(By.xpath("//*[@id='courses-iframe']"));
		 * driver.switchTo().frame(frameWebElement);
		 */
     
		// to get the text of the WEbElement emailId, hence we gave datatype as string as "getText()" returns string value
		String emailId = driver.findElement(By.xpath("//*[@class='icon fa fa-envelope']/parent::*")).getText();
		// parent::* is used to get parent of the given class (attribute)
		System.out.println(emailId);
		
		//switch out of frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("mousehover")).click();// to click on Mouse Hover button which is outside the frame
		
		driver.quit();

	}

	//to scroll to an element
	public static void scrollToElement(WebElement desiredElement) {  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
	}

	}


