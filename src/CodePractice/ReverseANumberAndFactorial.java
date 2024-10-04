package CodePractice;

import org.testng.annotations.Test;

public class ReverseANumberAndFactorial {

	/*
	 * Algo:-
	 * 1. Initialize a variable rev=0
	 * 2. Divide the num by 10 and capture the remainder and multiply by 10
	 * 3.Repeat the step 2 until the num to be divisible becomes 0
	 */
	public int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		return rev;
	}
	@Test
	public void check()
	{
		System.out.println(reverse(345623));
	}
	/*
	 * Algo For Factorial
	 * 1.initialize a var fact=1
	 * 2.repeat the number fact until you reach the user input n 
	 */
	public int factorialCalc(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	@Test
	public void checkFactorial()
	{
		System.out.println("the factorial is "+factorialCalc(10));
	}
}
