package CodePractice;

import org.testng.annotations.Test;

public class FibonacciSeries {

	private static final int MOD =  1000000007;
	public int series(int n)
	{
	   int sum=0;
			int a = 0;
			int a1=1;
			for(int i=0;i<=n;i++)
			{
			    if(i==0)
			    {
			        sum=a;
			    }
			    else if(i==1)
			    {
			        sum=a1;
			    }
			    else {
			    	sum=(a+a1) % MOD;
					a=a1;
					a1=sum;
				}
				
				System.out.print(sum+",");
			}
			return sum;
		
	}
	@Test
	public void printseries()
	{
		System.out.println(series(2000));
	}
}
