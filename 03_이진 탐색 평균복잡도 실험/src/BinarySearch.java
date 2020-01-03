import java.util.Random;

public class BinarySearch {
	private int[] a;
	private Random random = new Random();
	
	public BinarySearch(int[] a)
	{
		this.a = a;
	}
	
	public int search(int a[], int x)
	{
		int p=0,q=a.length-1;
		
		while(p<=q)
		{
			int i=(p+q)/2;
			if(a[i]==x) return i;
			
			if(a[i]<x) p=i+1;
			else q=i-1;
			
		}
		return -p-1;
	}
	public int search(int x)
	{
		int p=0,q=a.length-1;
		
		while(p<=q)
		{
			int i=(p+q)/2;
			if(a[i]==x) return i;
			
			if(a[i]<x) p=i+1;
			else q=i-1;
			
		}
		return -p-1;
	}
	
	public void makeArray(int n)
	{
		a = new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = random.nextInt(2*n)+1;
		}
	}
	
	public void sort()
	{
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public void print()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
}
