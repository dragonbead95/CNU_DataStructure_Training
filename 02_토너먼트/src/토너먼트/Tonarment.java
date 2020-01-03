package 토너먼트;

public class Tonarment {
	public int[] max_Tonarment(int[] a)
	{
		int[] aa = new int[a.length*2];
		System.arraycopy(a, 0, aa, a.length, a.length);
		
		for(int k=0;k<3;k++)
		{
			for(int i=0;i<aa.length;i+=2)
			{
				if(aa[i]>aa[i+1])
				{
					aa[i/2] = aa[i];
				}else {
					aa[i/2] = aa[i+1];
				}
			}
		}
		
		for(int i=0;i<aa.length;i++)
		{
			System.out.print(aa[i] + " / ");
		}
		
		return a;
	}
}
