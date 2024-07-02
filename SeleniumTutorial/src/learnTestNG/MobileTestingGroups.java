package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileTestingGroups {

	
	@Test(groups="Smoke") //to run smoke test
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	
	@Test
	public void secondMobileTest() {
		System.out.println("I am in second Mobile Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside before class Mobile");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after class Mobile ");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suites");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suites");
	}
		
	/**
	 * 
	 * SUITE
	 * TEST
	 * CLASS
	 * 
	 */
	
}
