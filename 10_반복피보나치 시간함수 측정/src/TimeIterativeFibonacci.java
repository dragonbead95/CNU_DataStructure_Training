
public class TimeIterativeFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=30;n<=40;n++)
		{
			long t0 = System.currentTimeMillis();
			long m = f(n);
			long t1 = System.currentTimeMillis();
			System.out.println("f("+n+") = " + m + "\ttime: " + (t1-t0));
		}
	}
	
	static long f(int n)
	{
		if(n<2) return n;
		long f0=0, f1=1, f2=1;
		for(int i=2;i<n;i++)
		{
			f0 = f1;
			f1 = f2;
			f2 = f0+f1;
		}
		return f2;
	}

}
