//Another method of Data Parameterization with Data Providers (Hard Coding : we give values manually, ie fixed data)
package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvidersHardCoding {
	 
	@Test(dataProvider="getData")
	public void mytest(String firstName, String lastName) {
		System.out.println("I am in mytest ");
		System.out.println(firstName +":"+lastName);
	}
	
	@DataProvider
	public Object[][] getData() { // return type is Object[][]
		
    String [][] data = new String[2][2]; // make a datatype object , String [][] is used to get string data
    //dataType [][]arrayRefVar= new datatype[size];  like int arr[][]=new int[row][column];
	
    
    data[0][0]="Virat"; // store data in 2D array
    data[0][1]="Kohli";
    data[1][0]="Anushka";
    data[1][1]="Sharma";
    
    return data; //return data to test (ie @Test(dataProvider="getData")) , as this is only a method "getData()" 
    
	}    
}
	
