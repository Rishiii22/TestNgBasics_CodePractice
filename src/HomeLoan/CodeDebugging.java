package HomeLoan;

import java.util.Arrays;

import org.testng.annotations.Test;
public class CodeDebugging {
	@Test
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
