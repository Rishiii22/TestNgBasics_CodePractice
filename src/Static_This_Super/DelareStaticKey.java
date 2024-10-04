package Static_This_Super;

public class DelareStaticKey {

	static int countStatic=0;
	int count=0;
	public void countIncrement()
	{
		count++;
		countStatic++;
		System.out.println("The count is "+count+" the count with static is "+countStatic);
	}
			
}
