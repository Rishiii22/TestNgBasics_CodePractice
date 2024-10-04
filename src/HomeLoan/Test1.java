package HomeLoan;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public static void EligibilityCriteria()
	{
		System.out.println("Income greater tan 50lpa");
	}
	@Test
	public static void MobileTestCase()
	{
		System.out.println("Mobile test ting in homeloan");
	}
	@Test
	public static void RestApitestCase()
	{
		System.out.println("RestAPITestCase in homeloan");
	}
	@Test
public static void MobileLogin()
{
	System.out.println("test case for mobile login");	
}
	@Test(groups = {"Smoke"})
	public static void MobileLogout()
	{
		System.out.println("Test case for mobile log out");
	}
	@BeforeTest
	public static void Prerequisite()
	{
		System.out.println("This is prerequisite test applied at test level");
	}
	@AfterTest
	public static void lastTestExecution()
	{
		System.out.println("The is the last method of test execution applied at test level");
	}
	@BeforeSuite
	public static void SuitePrerquisite()
	{
		System.out.println("This get's executed at the before each suite");
	}
	@AfterSuite
	public static void SuitePostCondition()
	{
		System.out.println("This get's executed at the end of each suite level");
	}
}
