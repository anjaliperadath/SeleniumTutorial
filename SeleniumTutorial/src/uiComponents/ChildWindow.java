package uiComponents;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		System.out.println(driver.getTitle());//to get title of the current window
		driver.findElement(By.xpath("//*[@class='example']/a")).click();// to click on "Click Here"
		/**
		 * Grab window handles
		 * use iterator to iterate the set to grab value for windows
		 * switch to desired window
		 */
	    
		Set<String> windowHandles = driver.getWindowHandles(); //Grab all the window handles that are open on a particular browser and list it in a set of strings.        
		Iterator<String> it = windowHandles.iterator();//use iterator to iterate the set to grab value for windows, create iterator and store it as "it".
		String parentWindow = it.next();// to grab parent window
		String childWindow = it.next();// to grab child window
		
		driver.switchTo().window(childWindow); // to switch to child window and grab its title
		System.out.println(driver.getTitle());

		driver.close();// to close child window
		
		driver.switchTo().window(parentWindow);// to switch to parent window and grab its title
		System.out.println(driver.getTitle());
		
		driver.quit();// to close all windows.
       
	}

}
