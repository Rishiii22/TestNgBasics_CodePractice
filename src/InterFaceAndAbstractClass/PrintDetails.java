package InterFaceAndAbstractClass;

import org.testng.annotations.Test;

public class PrintDetails {

	@Test
	public void checkInterface()
	{
		TrafficRules trafficIndiaRules=new IndianTraffic();
		TrafficRules trafficAustraliaRules= new AustralianTraffic();
		trafficIndiaRules.Greengo();
		trafficAustraliaRules.Greengo();
	}
}
