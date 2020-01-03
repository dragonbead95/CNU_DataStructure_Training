
public class Ratio implements RatioInterface {
	private int m;
	private double w;
	public Ratio(int m)
	{
		this.m = m;
		this.w = m/1;
	}
	
	public Ratio(int m, int n)
	{
		this.w = m/n;
	}
	
	@Override
	public Ratio plus(Ratio x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ratio minus(Ratio x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ratio times(Ratio x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ratio diviedBy(Ratio x) {
		// TODO Auto-generated method stub
		return null;
	}

}
