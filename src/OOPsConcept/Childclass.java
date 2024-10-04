package OOPsConcept;

import org.testng.annotations.Test;

public class Childclass extends ParentClass{
	ParentClass2 pc2=new ParentClass2(5);
	@Test
	public void test1()
	{
		System.out.println("I am test1");
	}
	@Test
	public void test2()
	{
		System.out.println("the incremented number is "+pc2.incrementNumber());
	}
	@Test
	public void multiply()
	{
		System.out.println(pc2.MultiplyByTwo());
		
	}

}
