
public class myCounter implements Counter{
	private int count;

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}


	@Override
	public void countPlus() {
		// TODO Auto-generated method stub
		count++;
	}


	@Override
	public void countReset() {
		// TODO Auto-generated method stub
		count=0;
	}
	
	public String toString()
	{
		return getCount()+"°³";
	}
}
