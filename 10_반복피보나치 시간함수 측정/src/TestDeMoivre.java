
public class TestDeMoivre {
	private static final double SR5 = Math.sqrt(5);
	private static final double PHI = (1+SR5)/2;
	private static final double PSI = (1-SR5)/2;
	
	public static void main(String args[])
	{
		for(int n=0;n<=10;n++)
			System.out.println("f(" + n + ") = " + f(n));
		for(int n=30;n<=40;n++)
		{
			long t0 = System.currentTimeMillis();
			long m = f(n);
			long t1 = System.currentTimeMillis();
			System.out.println("f(" + n +") = " + m + "\ttime : " + (t1-t0));
		}
	}
	
	static long f(int n)
	{
		return (long)((Math.pow(PHI, n))-Math.pow(PSI, n)/SR5);
	}
}
