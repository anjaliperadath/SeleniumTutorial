package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/**
		 * Syntaxes for Xpath
		 * 1. //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2. //parent/child  -> single slash let you grab immediate child
		 * 3. //parent//child -> concatenating two Xpath
		 * 4. //parent[index]/child or //parent[index]/child[index]
		 * 5. //*[contains(text(),'Substring')]   --> using text here 
		 * 6. //*[contains(@attribute,'substring value')]
		 */
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click(); // To click log in
		driver.findElement(By.xpath("//*[@class='email']")).sendKeys("obsqura24@gmail.com"); // To enter email
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("mypassword"); // To enter password
		driver.findElement(By.xpath("//div[@class='buttons']//input[@value='Log in']")).click(); // To click log in button
		
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click(); // To navigate to 4th option “Apparels and shoes” under categories
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Blue Jeans')]")).click(); // To find the product Blue Jeans
		
		WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]")); // To navigate to the Quantity number
		qtyBox.clear(); //to clear the number already present else the number we give will add on to the existing quantity.
		qtyBox.sendKeys("25");//to give value 25 in the quantity.
		driver.quit();
			
	}
}
