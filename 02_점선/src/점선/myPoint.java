package Á¡¼±;

public class myPoint implements Point {
	private int x,y;

	
	public myPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int getXPoint() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getYPoint() {
		// TODO Auto-generated method stub
		return y;
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(myPoint p1)
	{
		if(x==p1.getXPoint() && y==p1.getYPoint())
		{
			return true;
		}else {
			return false;
		}
	}
	
}
