package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
   
	static WebDriver driver;//declared driver as static variable as it is required in all methods
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement desiredElement = driver.findElement(By.cssSelector("[class='totalAmount']")); //to find the element to be scrolled to
		scrollToElement(desiredElement);//if same class then only method name (); is enough, no need classname.method name();
		scrollToBottomofPage() ;
		//scrollByValue(300); 
		driver.quit();

	}

	//to scroll to an element
	public static void scrollToElement(WebElement desiredElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);//arguments[0] refers to  desiredElement and operation to be 
	}                                                                          // performed is scrollIntoView

	//to scroll to the value(in pixel) not a generic method as the place of the element can be changed
	public static void scrollByValue(int value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll up to some y cordinate
		js.executeScript("window.scrollBy(0,300);");
	}
	
	//to scroll to bottom of the page
	public static void scrollToBottomofPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}


	}


