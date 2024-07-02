package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I AM IN ON TEST START");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I AM IN ON TEST SUCCESS");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I AM IN ON TEST failure");	
	}


	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I AM IN ON TEST Finish");
	}	

}
