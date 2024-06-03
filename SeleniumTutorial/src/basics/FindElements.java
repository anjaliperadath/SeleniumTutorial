//to find elements and add all elements to cart
package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//findelements return list of webelements
		
				List<WebElement> addToCartBtns = driver.findElements(By.className("btn_inventory"));//to locate the List, by classname 
				System.out.println(addToCartBtns.size());// to return the number of elements to be added to cart
//				
//				for(int i =0;i<addToCartBtns.size();i++) { //basic java for loop way to add all the elements or the for-each way below is good
//					addToCartBtns.get(i).click();
//				}

				for(WebElement addToCartBtn:addToCartBtns) {  // For-each loop to add all element to cart
					addToCartBtn.click();
				}
		
	}
}
