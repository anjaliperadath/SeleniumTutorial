//Another method of Data Parameterization with Data Providers (value automatically given by faker class)
package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class LearnDataProvidersFaker {
	
	@Test(dataProvider="getData")
	public void mytest(String firstName, String lastName) {
		System.out.println("I am in mytest ");
		System.out.println(firstName +":"+lastName);
	}
	
	
	@DataProvider
	public Object[][] getData() {  // return type is Object[][] 
		
		Faker faker = new Faker(); // object creation
		Object [][] data= new Object[2][2]; //to store the data that we get from faker class
		//make a datatype object (Object[][] means can get any type of data like numbers ie float , double, etc)
		//dataType [][]arrayRefVar= new datatype[size];  like int arr[][]=new int[row][column];
		
		data[0][0]= faker.name().firstName(); // .name().firstName() all are in built methods in faker class
		data[0][1]= faker.name().lastName();
		data[1][0]= faker.address().cityName();
		data[1][1]= faker.address().country();
		
		return data; //return data to test (ie @Test(dataProvider="getData")) , as this is only a method "getData()" 
	
	}
}
