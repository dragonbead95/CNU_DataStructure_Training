
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		str_lengthSort(args);
		print(args);
	}
	
	private static void print(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	
	private static void str_lengthSort(String[] args)
	{
		String temp;
		
		for(int i=0;i<args.length;i++)
		{
			for(int k=1;k<args.length-i;k++)
			{
				if(args[k-1].length() > args[k].length())
				{
					temp = args[k-1];
					args[k-1] = args[k];
					args[k] = temp;
				}
			}
		}
	}

}
