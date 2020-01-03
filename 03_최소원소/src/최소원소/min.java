package 최소원소;

public class min {
	public int min_seek(int[] a)
	{
		int index=0;
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
				index = i;
			}
		}
		return index;
	}
}
