/**********************************
 * 내용 : a와 aa 배열은 별개의 변수임을 알수 있다.
 *********************************/
public class Main {
	private static java.util.Random random = new java.util.Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = randomInts(10,1000);
		int[] aa = (int[])a.clone();
		
		print(a);
		print(aa);
		
		a[0] = a[1] = a[2] = 888;
		print(a);
		print(aa);
		
		
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		System.out.print("{" + a[0]);
		for(int i=1;i<a.length;i++)
			System.out.print(","+a[i]);
		System.out.println("}");
	}

	private static int[] randomInts(int n, int range) {
		// TODO Auto-generated method stub
		int []a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = random.nextInt(range);
		return a;
	}

}

