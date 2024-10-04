package CodePractice_OOPS;

public class Asus implements Laptop{

	@Override
	public String Keyboard() {
		// TODO Auto-generated method stub
		int numkeys=200;
		return "The number keys I have is "+numkeys;
	}

	@Override
	public double screen() {
		// TODO Auto-generated method stub
		return 20.98;
	}

	@Override
	public int ports() {
		// TODO Auto-generated method stub
		return 3;
	}

}
