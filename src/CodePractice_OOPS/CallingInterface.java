package CodePractice_OOPS;

import org.testng.annotations.Test;

public class CallingInterface {

	Laptop laptop;
	@Test
	public void printingAcer()
	{
		
		laptop=new Acer();
		System.out.println(laptop.screen());
	}
	
}
