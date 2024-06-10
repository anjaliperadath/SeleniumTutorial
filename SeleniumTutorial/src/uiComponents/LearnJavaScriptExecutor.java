package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js= (JavascriptExecutor)driver; //cast driver to javascript, "js" is a reference variable that can execute it.

		WebElement textBox = driver.findElement(By.xpath("//*[@id='single-input-field']"));// define WebElement to find textBox
		WebElement button = driver.findElement(By.cssSelector("[id='button-one']")); // define WebElement to find "ShowMessage" button
		
		js.executeScript("arguments[0].value='Hello Admin!';", textBox); //to execute arguments[0]=textbox and give value = 'Hello Admin!'
		js.executeScript("arguments[0].click();", button); //to execute arguments[0]=button and to click
		
		driver.quit();
	}

}
