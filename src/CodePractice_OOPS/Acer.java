package CodePractice_OOPS;

public class Acer implements Laptop {

	@Override
	public String Keyboard() {
		int numkeys=100;
		return "The number keys I have is "+numkeys;
	}

	@Override
	public double screen() {
		// TODO Auto-generated method stub
		return 15.6;
	}

	@Override
	public int ports() {
		// TODO Auto-generated method stub
		return 5;
	}
}
