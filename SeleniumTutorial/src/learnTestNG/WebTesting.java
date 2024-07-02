package learnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {

		
		/*
		 * 1. Anything annotated with @Test would be considered as a test case.
		 * 2. Order of execution of test cases would depend upon alphabetical order of test case.
		 * 3. Order of execution can be prioritized using priority. Lower priority means would be executed first . {0,1,2}
		 * 4. If any test case has same priority or no priority , alphabetical order will take precedence.
		 * 5. BeforeTest will execute once before all test cases present inside class
		 * 6. AfterTest will execute once after all test cases present inside class.
		 * 7. BeforeMethod will execute before every test case present inside class
		 * 8. AfterMethod will execute after every test case present inside class.
		 * 9. BeforeClass will execute before all test cases at a class level
		 * 10. AfterClass will execute after all test cases at a class level
		 * 11. After, Before suite - 
		 */
		
		@Test
		public void firstWebTest() {
			System.out.println("I am inside first web test case");
		} 
		
		
		
		@Test(priority=1)
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
		
        @BeforeMethod
        public void beforeMethod() {
			System.out.println("I am in before method");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("I am in after method");
		}
		
	}


