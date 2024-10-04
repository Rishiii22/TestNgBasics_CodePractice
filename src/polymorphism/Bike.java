package polymorphism;

public class Bike extends Vehicle {

	
	public void wheels()
	{
		System.out.println(this.getClass().getSimpleName()+" should have 3 wheels");
	}
	@Override
	public void headLight()
	{
		System.out.println(this.getClass().getSimpleName()+" should have 2 headlight");
	}
}
