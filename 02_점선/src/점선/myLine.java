package Á¡¼±;

public class myLine implements Line{
	private int x1,y1,x2,y2;
	private Point p1,p2;
	@Override
	public void setLine(myPoint p1, myPoint p2) {
		// TODO Auto-generated method stub
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public boolean equals(myLine l2)
	{
		if(p1.getXPoint()==l2.p1.getXPoint() && p1.getYPoint()==l2.p1.getYPoint() &&
				p2.getXPoint()==l2.p2.getXPoint() && p2.getYPoint()==l2.p2.getYPoint())
			return true;
		else 
			return false;
		
	}
	
	public String toString()
	{
		return "("+p1.getXPoint()+","+p1.getYPoint()+")("+p2.getXPoint()+","+p2.getYPoint()+")";
	}

	

	@Override
	public Point getPoint1() {
		// TODO Auto-generated method stub
		return p1;
	}

	@Override
	public Point getPoint2() {
		// TODO Auto-generated method stub
		return p2;
	}

	

	
	
}
