package PersonalLoan;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
@Test
public static void EligibilityCriteria()
{
	System.out.println("Income greater tan 5lpa");
}
@Test
public static void MobileTestCase()
{
	System.out.println("Mobile test ting in personalLoan");
}
@Test(groups = {"Smoke"})
public static void RestApitestCase()
{
	System.out.println("RestAPITestCase in personalLoan");
}
@BeforeMethod
public static void MethodSuite()
{
	System.out.println("This applies to each method with scope at class level only");
}
@BeforeClass
public static void beforeClassMethod()
{
	System.out.println("This method applies to class level only executes only before class only");
}
}
