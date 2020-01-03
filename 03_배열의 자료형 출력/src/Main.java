import java.util.Arrays;

public class Main {
	public static void main(String args[])
	{
		int[] a = new int[1];
		boolean[] b = new boolean[1];
		char[] c = new char[1];
		byte[] d = new byte[1];
		short[] e = new short[1];
		long[] f = new long[1];
		float[] g = new float[1];
		double[] h = new double[1];
		Object[] i = new Object[1];
		
		Object[] objects = {a,b,c,d,e,f,g,h,i};
		
		for(int i1=0;i1<objects.length;i1++)
		{
			System.out.println(objects[i1]);
		}
	}
}
