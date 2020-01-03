package 하노이타워;

public class HanoiTowers {
	public static void main(String args[])
	{
		int numTowers = 3;
		if(args.length>0) numTowers = Integer.parseInt(args[0]);
		print(3,'A','B','C');
	}
	
	static void print(int n, char x, char y, char z)
	{
		if(n==1)
			System.out.println(x + "->" + y);
		else {
			print(n-1,x,z,y);
			System.out.println(x + "->" + y);
			print(n-1,z,y,x);
		}
	}
}
