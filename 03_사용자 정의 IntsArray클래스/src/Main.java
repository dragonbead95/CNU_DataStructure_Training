import java.util.Random;

public class Main {
	private static Random random = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntsArrays ia = new IntsArrays();
		int[] a;
		int[] b = {1,2,3,4,5};
		int[] c = {1,2,3,4,5};
		a = ia.randomInts(10,10);
		System.out.println(ia.isSorted(a));
		ia.print(a);
		ia.swap(a, 0, 1);
		ia.print(a);
		
		a = ia.resize(a, 20);
		ia.print(a);
		
		b = ia.reverse(b);
		ia.print(b);
		
		a = ia.uniqueRandomInts(10, 7);
		ia.print(a);
		
		a = ia.permutaion(7);
		ia.print(a);
		
		System.out.println(ia.isSorted1(c));
}
	
	
	
	
	
	

}
