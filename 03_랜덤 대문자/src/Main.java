
public class Main {
	private static java.util.Random random = new java.util.Random();
	
	public static void main(String args[])
	{		
		System.out.println(letters(10));
	}
	
	public static String letters(int n)
	{
		String str="";
		
		for(int i=0;i<n;i++)
		{
			str = str + String.valueOf((char)((int)(random.nextInt(26)+65)));
		}
		
		return str;
		
	}
}
