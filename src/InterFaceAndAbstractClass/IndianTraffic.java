package InterFaceAndAbstractClass;

public class IndianTraffic implements TrafficRules {

	@Override
	public void Greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green signal go Ahead in "+this.getClass().getSimpleName());
		
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow signal wait in "+this.getClass().getSimpleName());
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red signal stop in "+this.getClass().getSimpleName());
		
	}
}
