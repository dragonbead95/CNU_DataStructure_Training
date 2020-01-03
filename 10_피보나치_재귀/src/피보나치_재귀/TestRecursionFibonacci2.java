package 피보나치_재귀;

public class TestRecursionFibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=30;i<=40;i++)
		{
			long t0 = System.currentTimeMillis();
			long m = f(i);
			long t1 = System.currentTimeMillis();
			System.out.println("f("+i+") = " + m + "\ttime: " + (t1-t0));
		}
	}
	
	static long f(int n)
	{
		if(n<1) return 0;
		if(n<3) return 1;
		return f(n-1) + f(n-2);
	}

}
