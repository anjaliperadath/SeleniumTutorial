package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");

		Actions act = new Actions(driver);//actions class to drag and drop element
		
		WebElement source = driver.findElement(By.id("draggable"));//source is which element to drag, to find source by id
		WebElement target = driver.findElement(By.id("droppable"));//target is which element to drop to, to find target by id
		
		act.dragAndDrop(source, target).perform();//to perform the act of drag and drop
		
		driver.quit();
		

	}
}
