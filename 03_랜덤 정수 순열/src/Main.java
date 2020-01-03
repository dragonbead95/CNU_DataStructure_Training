import java.util.Random;

public class Main {
	private static Random random = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = permutation(10);
		
		print(a);
	}
	
	private static int[] permutation(int n)
	{
		int a[] = new int[n];
		
		for(int i=0;i<=n-1;i++)
		{
			a[i] =  randomRange(0,n-1);
			
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					i--;
				}
			}
		}
		
		print(a);
		sort(a);
		
		return a;
	}
	
	private static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static int randomRange(int n1, int n2)
	{
		return (int)(Math.random()*(n2-n1+1))+n1;
	}
	
	private static void sort(int[] a)
	{
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]>a[k])
				{
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}
	}

}
