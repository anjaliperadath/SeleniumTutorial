package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests {
	
	@Test
	public void mytest1API() {
		System.out.println("i am in test1");
	}
	
	@Test
	public void mytest2API() {
	System.out.println("i am in test2");
	Assert.fail();
	}
}


