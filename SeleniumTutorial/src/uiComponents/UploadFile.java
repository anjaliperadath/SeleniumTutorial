package uiComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.cssSelector("#pickfiles")).click();// to locate and click on "Select PDF File" button
		
		String fileToUpload= System.getProperty("user.dir")+"\\fileName.pdf";//(C:\Users\Sys\git\SeleniumTutorial\SeleniumTutorial\fileName)
		//"user.dir"+"\\fileName.pdf" is the general way of getting path in any system, "fileName" is the name of the file to be uploaded 
		uploadFile(fileToUpload); // method to upload file
		
		driver.quit();

	}

	public static void uploadFile(String fileToUpload) throws AWTException, InterruptedException {
		
		StringSelection ss = new StringSelection(fileToUpload); 
		//"StringSelection ss" has the path, whatever path we send it will make the string transferable to fileToUpload
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//toolkit will copy the path of file to clipboard

	    Thread.sleep(1000);
	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}
