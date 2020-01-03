
public class TimeSortedFibonacci {
	public static void main(String args[])
	{
		for(int n=30;n<=40;n++)
		{
			long t0 = System.currentTimeMillis();
			long m = Fibonacci.number(n);
			long t1 = System.currentTimeMillis();
			System.out.println("f("+n+") = " + m + "\ttime: " + (t1-t0));
		}
	}
}

class Fibonacci{
	private static long[] fib = new long[100];
	private static int lastFibIndex = 2;
	
	static {
		fib[1] = fib[2] = 1;
	}
	
	public static long number(int n)
	{
		for(int i=lastFibIndex+1;i<=n;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		if(n>lastFibIndex)
			lastFibIndex = n;
		return fib[n];
	}
}
