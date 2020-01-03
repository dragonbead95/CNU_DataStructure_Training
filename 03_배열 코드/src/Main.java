
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {22,33,11};
		System.out.println(x);
		int[] y = {22,33,11};
		System.out.println(y);
		boolean eqeq = (x==y);
		System.out.println("eqeq = " + eqeq);
		boolean dotEq = java.util.Arrays.equals(x, y);
		System.out.println("dotEq = " + dotEq);
		y=x;
		System.out.println(y);
		eqeq = (x==y);
		System.out.println("eqeq = " + eqeq);
	}

}
