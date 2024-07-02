//Hard Assert : if any assertion fails at a point, program will fail there or not go ahead
package learnAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssert {
	
	@Test
	public void hardAssert() {
		
		String actualName = "Amrith"; 
		
		String expectedName= "amrith";
		/**
		 * In hard assertion
		 * if any assertion fails at a point, program will fail there or not go ahead
		 */
	   //compare two values equal or not
		Assert.assertEquals(actualName, expectedName);
		
		System.out.println("I am here"); //if actualName = expectedName, then only this will print
	
		//compare condition is true or not
		Assert.assertTrue(true, "i am failing intentionally");// this message "i am failing intentionally" appears if failed only
		// Assert.assertTrue(true) expects true result only , if false is given it fails.
		
		System.out.println("I am there");
		
		Assert.assertFalse(false);
       // Assert.assertFalse(false) expects false result only , if true is given it fails.
		
	}
}
