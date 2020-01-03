
public class TestRecursiveFactorial {
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i + "\t" +factorial(i));
		}
	}
	
	public static long factorial(int n)
	{
		if(n<2) return 1;
		return n*factorial(n-1);
	}
}
