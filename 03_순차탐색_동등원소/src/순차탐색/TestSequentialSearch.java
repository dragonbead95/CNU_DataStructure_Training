package ����Ž��;

public class TestSequentialSearch {
	public static void main(String args[])
	{
		int a[]= {66,44,99,33,55,22,55,77};
		System.out.println("search(" + 55 + "):" + search(a,55));
		System.out.println("search(" + 50 + "):" + search(a,50));
	}
	
	public static int search(int a[], int target)
	{
		int max_index=-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target) {
				max_index = i;
			}
		}
		if(max_index != -1)
		{
			return max_index;
		}else {
			return -a.length;
		}
		
	}
}
