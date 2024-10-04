package Static_This_Super;

import org.testng.annotations.Test;

public class ChildSuperThisClass extends ParentSuperClass {
	String sweetString="RasgullaLocal";
	void sweetName(String sweetString)
	{
		System.out.println("the name of local sweet is "+sweetString);
	}
	@Test
	public void printSuper()
	{
		
		System.out.println("Current class "+sweetString+" super claas "+super.sweetString);
		super.sweetName(super.sweetString);
		sweetName(sweetString);
	}
}
