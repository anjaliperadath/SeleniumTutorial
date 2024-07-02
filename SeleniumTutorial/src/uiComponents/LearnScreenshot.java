package uiComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args)throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;// cast driver to TakesScreenshot interface
		//(interface)     (object)
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE); // took screenshot and stored it in src (arbitary position)
		// getScreenshotAs(OutputType.FILE) a method and .FILE can be anything
		
		File destFile = new File(System.getProperty("user.dir")+"//screenshot"+getCurrentDateTime()+".png"); 
		//to paste the screenshot from arbitary position to the destination we want.
		//used getCurrentDateTime() as if we give direct path then screenshot can only be taken once, now we can print as many times 
		//as date and time will be changed  
		
		FileUtils.moveFile(srcFile, destFile); //used to move file
		
		driver.quit();	

	}	

	public static String getCurrentDateTime() {
		String dateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());// its a format
		String date = dateTime.replaceAll("/", "").replaceAll(":", "");// to replace special character from file name and time
		System.out.println(date);
		return date;
	}

	}


