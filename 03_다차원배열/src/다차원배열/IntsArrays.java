package �������迭;

public class IntsArrays {
	private static java.util.Random random = new java.util.Random();
	
	public static boolean isSorted(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1]) return false;
		}
		return true;
	}
	
	public static void print(int[] a)
	{
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++)
		{
			System.out.print(","+a[i]);
		}
		
		System.out.print("}");
		System.out.println();
	}
	
	public static int[] randomInts(int n, int range)
	{
		if(n<0 || range<2) throw new IllegalArgumentException();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = random.nextInt(range);
		return a;
	}
	
	public static int[] resize(int a[], int n)
	{
		if(n<a.length) throw new IllegalArgumentException();
		int[] aa = new int[n];
		System.arraycopy(a, 0, aa, 0, a.length);
		return aa;
	}
	
	public static void swap(int[] a, int i, int j)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
