
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
	
	public static int[] truncate(int[] a, int n)
	{
		int aa[] = a.clone();
		aa[0] = n;
		return aa;
	}
	
	public static int[] reverse(int[] a)
	{
		int aa[] = a.clone();
		
		for(int i=0;i<aa.length/2;i++)
		{
			swap(aa,i,aa.length-1-i);
		}
		return aa;
	}
	
	public static int[] uniqueRandomInts(int n, int range)
	{
		int aa[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			aa[i] = random.nextInt(range);
		}
		
		return aa;
	}
	
	public static int[] permutaion(int n)
	{
		int aa[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			aa[i] = random.nextInt(n);
		}
		
		return aa;
	}
	
	public static boolean isDescending(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]<a[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAescending(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]>a[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSorted1(int[] a)
	{
		if(isDescending(a))
		{
			System.out.println("내림차순");
			return true;
		}else if(isAescending(a)) {
			System.out.println("오름차순");
			return true;
		}else {
			System.out.println("정렬안됨");
			return false;
		}
	}
}
