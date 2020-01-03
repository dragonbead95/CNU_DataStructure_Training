
public class Permutations {
	public static void main(String[] args)
	{
		String s = "ABC";
		if(args.length>0) s = args[0];
		print(s);
	}
	
	public static void print(String s)
	{
		print(new StringBuffer(s),0);
	}
	
	private static void print(StringBuffer s, int k)
	{
		if(k==s.length()-1)
			System.out.println(s);
		else
		{
			for(int i=k;i<s.length();i++)
			{
				swap(s,k,i);
				print(s,k+1);
				swap(s,k,i);
			}
		}
	}
	
	private static void swap(StringBuffer s, int i, int j)
	{
		if(i==j) return;
		char ch = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, ch);
	}
}
