package 합병정렬;

public class Merge {
	
	
	public void merge(int[] a)
	{
		int low = 0;
		int high = a.length-1;
		
		mergeSort(a,low,high);
	}
	
	public void mergeSort(int[] a, int low, int high)
	{
		int mid;
		
		if(low<high)
		{
			mid = (low+high)/2;
			
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			
			mergeTwoArea(a, low, mid, high);
		}
	}
	
	public void mergeTwoArea(int[] a, int low, int mid, int high)
	{
		int fidx = low;
		int ridx = mid+1;
		int i;
		
		int[] aa = new int[high+1];
		int sidx = low;
		
		while(fidx<=mid && ridx<=high)
		{	
			if(a[fidx]<=a[ridx])
			{
				aa[sidx] = a[fidx++];
			}else {
				aa[sidx] = a[ridx++];
			}
			sidx++;
		}
		
		if(fidx>mid)
		{
			for(i=ridx;i<=high;i++,sidx++)
			{
				aa[sidx] = a[i];
			}
		}else {
			for(i=fidx;i<=mid;i++,sidx++)
			{
				aa[sidx] = a[i];
			}
		}
		
		for(i=low;i<=high;i++)
		{
			a[i] = aa[i];
		}
	}
	
	
}
