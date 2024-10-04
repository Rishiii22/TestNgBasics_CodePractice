package polymorphism;

import org.testng.annotations.Test;

public class Runner {

	Bike bike=new Bike();
	Vehicle vehicle=new Bike();
	
	@Test
	public void runningPolymorphism()
	{
		bike.headLight();
		vehicle.headLight();
	}
}
