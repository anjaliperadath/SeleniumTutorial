package uiComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	
	@Test
	public void handleJSAlert() throws InterruptedException {  //to handle JavaScript Alert
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.cssSelector(".btn-success")).click(); // to locate and click JavaScript Alert box click me!
		
		Alert alert = driver.switchTo().alert();// Alert is an interface , of type alert , to switch to alert ()
	    Thread.sleep(2000); // just to view the process
	    alert.accept();//click on ok button
	    
	    driver.findElement(By.cssSelector(".btn-warning")).click();	// to locate and click JavaScript Confirm box click me!
	    Thread.sleep(2000);
	    alert.dismiss(); //click on cancel button
	    
	    driver.findElement(By.cssSelector(".btn-danger")).click(); // to locate and click JavaScript Alert box click for Prompt box 
	    alert.sendKeys("hi how are you !"); // to enter this text
	    Thread.sleep(2000);
	    alert.accept(); // click on ok button
	    
	    driver.quit();
	}
}
