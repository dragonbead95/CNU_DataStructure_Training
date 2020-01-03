
public class PascalsTriangle {
	public static void main(String args[])
	{
		int rows = 7;
		int[][] a = init(rows);
		print(a);
	}
	
	static int[][] init(int n)
	{
		int [][] a = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				if(k==0 || k==i)
					a[i][k] = 1;
				else
					a[i][k] = a[i-1][k-1]+a[i-1][k];
			}
		}
		return a;
	}
	
	static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<=i;k++)
			{
				print(a[i][k],5);
			}
			System.out.println();
		}
	}

	private static void print(int n, int w) {
		// TODO Auto-generated method stub
		String s = " " + n;
		
		int len = s.length();
		System.out.print(s);
	}
	
	
}
