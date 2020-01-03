
public class Main {
	public static void main(String args[])
	{
		double x=5;
		double y=0;
		
		y=(x+1)/2;
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("i=" + i + " x=" + x + " y^2=" + y*y);
			y = (y+x/y)/2;
			
		}
		System.out.println("Á¦°ö±Ù y°ª : " + y);
	}
}
