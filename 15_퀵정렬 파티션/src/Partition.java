
public class Partition {
	public int partition(int[] a)
	{
		int i,j;
		int pivot;
		
		i = 1;
		j = a.length-1;
		pivot = a[0];
		
		while(i<=j)
		{
			while(pivot>=a[i] && i<=j)
			{
				i++;
			}
			
			while(pivot<a[j] && j>=1)
			{
				j--;
			}
			
			if(i<=j)
			{
				swap(a,i,j);
			}
		}
		
		swap(a,0,j);
		
		return j;
	}
	
	public void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
