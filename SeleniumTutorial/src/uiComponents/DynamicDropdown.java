package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");//*[contains(@attribute,'substring value')]
		
		List<WebElement> states = driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));//parent/child  -> single slash let you grab immediate child
		System.out.println(states.size()); // to grab the size of the list
		
	 	/* for(int i =0;i<states.size();i++) {    //basic java for loop way to click on New York
			if(states.get(i).getText().equalsIgnoreCase("New York")) {
				states.get(i).click();
				
			}
				
		} */
		
		for(WebElement state : states) { //For-each loop to click on New Jersey
			if(state.getText().equalsIgnoreCase("new jersey")) {
				state.click();
				break; // if we dont give break it will throw exception that element not found as even after clicking on new jersey it will
				    //move to New york but it cant be done as dropdown list closes. so we have to give break once the required option found. 
			}
		}
		

	}
}
