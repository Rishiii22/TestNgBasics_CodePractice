package Static_This_Super;

import org.testng.annotations.Test;

public class printStaticResult {

	DelareStaticKey d1 =new DelareStaticKey();
	DelareStaticKey d2 =new DelareStaticKey();
	DelareStaticKey d3 =new DelareStaticKey();
@Test
public void testStaticVariable()
{
	d1.countIncrement();
	d2.countIncrement();
	d3.countIncrement();
}
}
