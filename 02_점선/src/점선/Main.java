package Á¡¼±;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myPoint p1 = new myPoint(5,4);
		myPoint p2 = new myPoint(5,4);
		
		myLine l1 = new myLine();
		myLine l2 = new myLine();
		
		l1.setLine(p1, p2);
		l2.setLine(p1, p2);
		
		System.out.println(l1.equals(l2));
		
		
		
		
	}

}
