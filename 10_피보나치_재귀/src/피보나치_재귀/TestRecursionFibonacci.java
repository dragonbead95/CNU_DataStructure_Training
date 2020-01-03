package 피보나치_재귀;

public class TestRecursionFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<13;i++)
		{
			System.out.println(i + "\t" + f(i));
		}
	}
	
	static long f(int n)
	{
		if(n<1) return 0;
		if(n<3) return 1;
		return f(n-1) + f(n-2);
	}

}
