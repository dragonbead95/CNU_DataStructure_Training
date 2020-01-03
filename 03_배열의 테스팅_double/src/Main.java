/**********************************
 * 내용 : a와 aa 배열은 별개의 변수임을 알수 있다.
 *********************************/
public class Main {
	private static java.util.Random random = new java.util.Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = randomInts(10,1000);
		double[] aa = (double[])a.clone();
		
		print(a);
		print(aa);
		
		a[0] = a[1] = a[2] = 888;
		print(a);
		print(aa);
		
		
	}

	private static void print(double[] a) {
		printf(a[0],"{#.###");
		for(int i=1;i<a.length;i++)
		{
			printf(a[i],"','#.###");
		}
			System.out.println("}");
		
	}
	private static void printf(double x, String fs)
	{
		System.out.print(new java.text.DecimalFormat(fs).format(x));
	}

	private static double[] randomInts(int n, int range) {
		// TODO Auto-generated method stub
		double []a = new double[n];
		for(int i=0;i<n;i++)
			a[i] = random.nextDouble();
		return a;
	}

}
