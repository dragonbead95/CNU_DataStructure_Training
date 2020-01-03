package ÀÌÁøÅ½»ö;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {22,33,44,55,66,77,88,99};
		//System.out.println("search(a"+55+"):"+search(a,55));
		int result = search(a,50);
		int i = 0;
		
		if(result<0)
		{
			i = result*(-1);
			
			System.arraycopy(a, i-1, a, i, a.length-i);
			a[i-1] = 50;
		}
		
		System.out.println("a[3] : " + a[i-1] + " a[4] : " + a[i]);
	}
	
	static int search(int a[], int x)
	{
		int p=0,q=a.length-1;
		
		while(p<=q)
		{
			int i=(p+q)/2;
			if(a[i]==x) return i;
			
			if(a[i]<x) p=i+1;
			else q=i-1;
			
		}
		return -p-1;
	}

}
