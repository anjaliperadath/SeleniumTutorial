// one method of data Parameterization 
package dataProviders;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterizationSimple {
	
// @Optional is given when we want the test to execute even if we don't pass parameters, null is given automatically and test will pass
	@Test
	@Parameters({"UserName","Password"})
	public void firstWebTest( @Optional String userName, @Optional String password) {
		System.out.println("I am inside first web test case");
		System.out.println(userName +  " : "+ password);
	} 
	
	@Test
	@Parameters({"UserName1","Password1"}) //we have to pass parameters in xml file else test will fail
	public void secondWebTest( String userName1, String password1) {
		System.out.println("I am inside second web test case");
		System.out.println(userName1 +  " : "+ password1);
	} 
}
