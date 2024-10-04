package FinalFinallyFinalize;

import org.testng.annotations.Test;

public class testfinalAndFinally {

	DeclareFinalFinallyFinalize d1=new DeclareFinalFinallyFinalize();
	@Test
	public void testing()
	{
		d1.modifyFinal();
		d1=null;
		System.gc();
		System.out.println("End of garbage collection");
	}
}
