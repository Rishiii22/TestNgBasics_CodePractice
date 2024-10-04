package polymorphism;

import bsh.This;

public class Vehicle {

	public void wheels()
	{
		System.out.println(this.getClass().getSimpleName()+" should have wheels");
	}
	public void headLight()
	{
		System.out.println(this.getClass().getSimpleName()+" should have headlight");
	}
	
}
