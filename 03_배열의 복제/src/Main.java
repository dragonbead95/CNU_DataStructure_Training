import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] re;
		
		re = getCopy(a);
		
		for(int i=0;i<re.length;i++)
		{
			System.out.print(re[i] + " ");
		}
		System.out.println();
		a[0]=2;
		for(int i=0;i<re.length;i++)
		{
			System.out.print(re[i] + " ");
		}
	}
	
	public static int[] getCopy(int[] a)
	{
		int[] b = a.clone();
		return b;
	}

}
