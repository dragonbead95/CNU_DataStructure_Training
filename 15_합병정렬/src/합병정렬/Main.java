package 합병정렬;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge m = new Merge();
		int a[] = {1,3,5,7,9,2,4,6,8,10};
		m.merge(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
