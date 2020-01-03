
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exp(2,8));
		System.out.println(exp2(2,8));
	}
	
	static double exp(double x, int n)
	{
		double y = 1.0;
		for(int i=0;i<n;i++)
		{
			y = y * x;
		}
		return y;
	}
	
	static double exp2(double x, int n)
	{
		double factor = (n%2==0?1.0:x);
		if(n<2)
			return factor;
		return factor*exp2(x*x,n/2);
	}
}
