//SoftAssert it will execute rest of the codes even if one fails , it will print even if all test fails
package learnAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert { 
	
	@Test
	public void learnsoftAssert() {
		
		SoftAssert softAssert = new SoftAssert(); 
		//(class)   (object)
		
	   String actualName = "Amrith";	
	   String expectedName= "amrith";
		
	   //compare two values equal or not
		softAssert.assertEquals(actualName, expectedName);
		// replace Assert.assertEquals(actualName, expectedName); in Hard Assert with softAssert.assertEquals(actualName, expectedName);
		
		System.out.println("I am here");
	
		//compare condition is true or not
		softAssert.assertTrue(false);
		
		System.out.println("I am there");
		
		softAssert.assertFalse(true);
		
		softAssert.assertAll();//it will throw all failed assertions in the end.
	}
}


