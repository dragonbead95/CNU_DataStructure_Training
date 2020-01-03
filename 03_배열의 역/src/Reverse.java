
public class Reverse {
	public static void main(String args[])
	{
		int[] a = {1,2,3,4};
		reverse(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void reverse(int[] a)
	{
		int n= a.length;
		for(int i=0;i<n/2;i++)
		{
			swap(a,i,n-1-i);
		}
	}
	
	public static void swap(int a[], int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
