package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		// Ctrl+shift+o (to import webdriver and chromedriver)
        WebDriver driver = new ChromeDriver();//parent obj = new child();abstraction using interface 
        //Webdriver=interface and chrome driver=class
        
		//will maximize chrome
        driver.manage().window().maximize();
		
		//will open a URL
		driver.get("https://www.flipkart.com/");
		
		//to grabTitle of page
		String title=driver.getTitle();
		System.out.println(title);
			
		//to grab current URL
		System.out.println(driver.getCurrentUrl());
		
		//to navigate in back direction		
		driver.navigate().back();
				
		//to navigate in forward direction
		driver.navigate().forward();
				
		//will close current window
		driver.close();
		
		//close entire browser
		driver.quit();
		
	}
}
