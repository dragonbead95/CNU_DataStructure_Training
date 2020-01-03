
public class Frequency {
	public int frequency(int[] a, int value)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				count++;
			}
		}
		
		return count;
	}
}
