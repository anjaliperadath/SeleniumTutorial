package learnTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTestingGroups {
	
	@Test(groups="Smoke") //to run smoke test
	public void firstWebTest() {
		System.out.println("I am inside first web test case");
	} 
		
	@Test(priority=1, groups="Regression")  //to run regression test
	public void secondWebTest() {
		System.out.println("I am inside second web test case");
	} 
	
	@BeforeTest
	public void beforeWebTest() {
		System.out.println("I am in before web test");
	}
		
	@AfterTest
	public void afterWebTest() {
		System.out.println("I am in after web test");
	}
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("I am in before method");
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("I am in after method");
//	}
		
}
