package ¹öºí¾÷;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,2,4,1};
		print(a);
		bubble(a);
		print(a);
	}
	
	private static void bubble(int[] a)
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
	
	private static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
