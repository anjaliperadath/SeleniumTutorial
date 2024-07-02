package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnHeirachy {
	
	@Test
	public void firstTest() {
		System.out.println("I am inside first test case");
	} 
		
	@Test(priority=1)
	public void secondTest() {
		System.out.println("I am inside second test case");
	} 
	
	@Test(priority=2)
	public void thirdTest() {
		System.out.println("I am inside third test case");
	} 
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suites");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suites");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside before class");
	}
			
	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after class");
	}
				
}
