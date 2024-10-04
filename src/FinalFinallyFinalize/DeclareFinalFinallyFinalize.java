package FinalFinallyFinalize;

public class DeclareFinalFinallyFinalize {
final int count=0;
public void modifyFinal()
{
//	count++;
	System.out.println(count);
}
protected void finalize()
{
	System.out.println("The finalize block is executed");
}
}
