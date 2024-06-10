package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTables {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr[4]/td"));
		//We used list to store the WebElements of the row 
		//parent/child  -> single slash let you grab immediate child
		
		System.out.println(rowData.size()); //to grab the size of the row i.e. number of data in the row
		
		for(WebElement data : rowData) {       // For WebElement data from the rowData,for-each loop to get the data of the rowData (list)
			System.out.println(data.getText()); //data.getText() is used to get text of each element in the rowData List
		}

		driver.quit();

	}
}
