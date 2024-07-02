package Reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnReports {
	
	ExtentReports extent;// make it global as it is used in all tests
	
	@BeforeTest
	public void generateReport() {
		
		String reportPath = System.getProperty("user.dir")+"/Reports/index.html";//where do you want to generate the report, location
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);//ExtentSparkReporter is a class with object reporter 
		// object "reporter" is used to configure
		reporter.config().setDocumentTitle("Automation Report");//set the document title
		reporter.config().setReportName("Demo WebShop"); // set the report name
		
		extent = new ExtentReports();// to create a HTML document another class ExtentReports is created
		extent.attachReporter(reporter);//attachReporter() object is responsible in attaching the report with whichever it extents
		extent.setSystemInfo("QA Name", "Anjali");//set the additional info
		extent.setSystemInfo("Brand", "Demo WebShop");
		
	}
	
	@Test
	public void mytest1() {
		
		ExtentTest test = extent.createTest("mytest1");//to create a test "mytest1"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		test.log(Status.PASS, "I am passing");//we are hardcoding as PASS
		driver.quit();
		extent.flush();//it will flush the report to HTML, only then the report will be created
		
	}
	
	@Test
	public void mytest2() {
		
		ExtentTest test = extent.createTest("mytest2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		test.log(Status.PASS, "Passed");
		driver.quit();
		extent.flush();
		
	}

	@Test
	public void mytest3() {
		ExtentTest test = extent.createTest("mytest3");
		test.log(Status.FAIL, "Failing deliberately");
		extent.flush();
	}
}
