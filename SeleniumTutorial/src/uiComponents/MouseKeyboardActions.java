package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		Actions act = new Actions(driver); // Actions is the class which consist of many methods to perform mouse and keyboard actions
		                                   // act is the object, new Actions accepts the driver.
		WebElement others=driver.findElement(By.cssSelector("#others"));// to move to the others option
		
		//hover over an element
		act.moveToElement(others).perform(); // to hover over on "others" option
		
		WebElement textBox = driver.findElement(By.cssSelector("#single-input-field"));// to find "Message" field
		
		act.moveToElement(textBox).click().sendKeys("mandy").perform();// to click "Message" field and enter the text "mandy"
		
		textBox.clear();//to clear "Message" field
		
		//pressing shift key while entering data in textbox
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("mandy").perform(); // to get the text in capital letter
		//keyDown is used to press shift key and keyUp is used to release shift key
		
	    // act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).sendKeys("andy").perform();
		// to type message "Mandy" M is capital and "andy" is small
		
		WebElement btn = driver.findElement(By.cssSelector("#button-one")); // to find the "Show Message" button
	
		//double click
		act.moveToElement(btn).doubleClick().perform(); // to click on "Show Message" button which we stored in WebElement btn
		                                                // here click and doubleclick is same operation so gave doubleclick
		
		//Right Click
		act.moveToElement(btn).contextClick().perform(); // to right click on btn (Show Message button)
		
		driver.quit();
		
	}

}
