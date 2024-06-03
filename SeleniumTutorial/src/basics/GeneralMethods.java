package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.yatra.com/");
		
		//Grab Text
		WebElement heading=driver.findElement(By.xpath("//h1[@class='main-heading']"));
		String headingText=heading.getText();
		System.out.println(headingText);
		
		//grab value of any attribute
		String value=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[1]/a")).getAttribute("title");//title is the attribute
		System.out.println(value);
		
		//tooltip= value of the title attribute , what we get when we hover hover on the title
		String toolTip=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[2]/a")).getAttribute("title");
        System.out.println(toolTip);
        
        //To get any css value
        String cssValue=heading.getCssValue("font-weight");
        System.out.println(cssValue);
		
        driver.quit();			
		
	}
}
