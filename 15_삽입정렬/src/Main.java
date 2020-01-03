

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,1,3};
		print(a);
		insert(a);
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
	
	private static void insert(int[] a)
	{
		int temp;
		int i,j;
		
		for(i=1;i<a.length;i++)
		{
			temp = a[i];
			
			for(j=i-1;j>=0;j--)
			{
				if(a[j]>temp)
				{
					a[j+1] = a[j];
				}else {
					break;
				}
			}
			
			a[j+1] = temp;
		}
	}
}
