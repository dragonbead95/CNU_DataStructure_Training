package 다차원배열;

public class TwoDimensionlArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int [3][];
		a[0]= new int[] {22,44,66,88};
		a[2]=new int[] {33,77};
		System.out.println("a:" + a + "\na.length: " + a.length);
		IntsArrays.print(a[0]);
		IntsArrays.print(a[2]);
		
		System.out.println("a[2].length:" + a[2].length);
		
		int[][] b = {{22,44,66,88},{0,0,0,0},{33,55,77,0}};
		System.out.println("b:" + b + "\nb.length: " + b.length);
		IntsArrays.print(b[0]);
		IntsArrays.print(b[2]);
		System.out.println("b[2].length:" + b[2].length);
	}

}
