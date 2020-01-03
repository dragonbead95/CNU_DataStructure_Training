
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {22,33,44,55,66,0};
//		int k[] = new int[6];
		
//		insert(a,k,30,5);
//		print(a,k);
		int a[] = {33,55,77,99,77,55,33,0};
		print(a);
		delete(a,6,55);
		print(a);
		
	}
	public static void insert(int[] a,int[] k, int x, int free)
	{
		int i=0;
		while(k[0]!=0 && a[k[i]]<x)
		{
			i=k[i];
		}
		a[free] = x;
		k[free] = k[i];
		k[i] = free++;
		
	}
	
	public static void delete(int[] a, int n, int k)
	{
		if(n<0 || n>=a.length) throw new IllegalArgumentException();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.arraycopy(a, i+1, a, i, a.length-i-1);
				break;
			}
		}
	}
	
	public static void print(int[] a,int[] k)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
