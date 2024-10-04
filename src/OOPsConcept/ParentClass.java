package OOPsConcept;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass{
@BeforeMethod
public void RunmeBeore()
{
	System.out.println("I am present at parent class and run me before every method");
}
@AfterMethod
public void RunmeAfter()
{
	System.out.println("I am present at parent class and run me after every method");
}

}
