package 선택정렬;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,2,3,1,4};
		print(a);
		select(a);
		print(a);
	}
	private static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	private static void select(int[] a)
	{
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
