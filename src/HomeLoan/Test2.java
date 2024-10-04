package HomeLoan;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Test(dependsOnMethods = {"criteria2"})
	public static void criteria1()
	{
		System.out.println("this is eligibility criteria 1,execute me at 2nd");
	}
	@Test(groups = {"Smoke"},dataProvider = "getDatsa")
	public static void criteria2(String username,String pass)
	{
		System.out.println("This is eligibility criteria2, execute me at 1st");
		System.err.println("username is "+ username+" password is "+pass);
	}
	@Test(dependsOnMethods = {"criteria1"}) @Parameters({"URL","name"})
	public static void acriteria3(String url,String name)
	{
		System.out.println("Execute me at last");
		System.out.println("url is "+url+" the name is "+ name);
	}
	@Test @Parameters({"URL","name"})
	public void testingParameter(String url,String name)
	{
		System.out.println(url+"\t"+name);
	}
	@DataProvider
	public  Object[][] getDatsa()
	{
		// Example to demonstrate testNg data provider
//		1st row user name and password of a ppl->good credit history
//		2nd row user name and pass of a ppl->zero credit history
//		3rd row username and pass of a ppl-> fraud credit history
		Object[][] objects=new Object[3][2];
		objects[0][0]="first username";
		objects[0][1]="first pass";
		objects[1][0]="second username";
		objects[1][1]="third pass";
		objects[2][0]="third username";
		objects[2][2]="third pass";
		System.out.println(Arrays.toString(objects));
		return objects;
	}
	

}
