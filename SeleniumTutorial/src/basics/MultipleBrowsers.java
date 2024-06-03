package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		
		String browserName= "Chrome";
		WebDriver driver= null;//null pointer exception (any browserName other than these 3 it will throw null pointer exception)
		
		if(browserName.equalsIgnoreCase("Chrome")) {//EqualsIgnoreCase means case does not matter either upper or lower case chrome it is ok
			 driver = new ChromeDriver();//to open chrome 
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();// to open firefox 
		}
		else if (browserName.equalsIgnoreCase("msedge")) {   //Click Ctrl+sift+o to import all the drivers
			driver = new EdgeDriver();// to open msedge
		}
		driver.manage().window().maximize();//to maximize chrome
		driver.get("https://www.saucedemo.com/");//to open this url
		//driver.quit();

	} //if else if ladder need not always end with else, we can give according to our wish, if all the else if conditions are not satisfied
}     //it will execute else..here else is not required. 
     /* Here since we gave WebDriver driver= null; we need not write "WebDriver driver" in all the if else if conditions below as we already
       declared, so initialisation is driver = new ChromeDriver(); 
       just like int num; (declaration) 
                 num = 10; (initialisation)     */
