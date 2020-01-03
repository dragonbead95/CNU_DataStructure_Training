
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {33,25,85,69,14,48,35};
		int result;
		
		result = seek_max(a);
		System.out.println(result);
		
		swap(a, 0, 1);
		print(a);
	}
	
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static int seek_max(int a[])
	{
		int max = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}
	
	public static void swap(int a[],int i,int j)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
