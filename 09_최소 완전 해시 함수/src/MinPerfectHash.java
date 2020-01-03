
public class MinPerfectHash {
	private final static String LETTERS= "GRTADLPSUIK-BNFE";;
	
	static private int v(char ch)
	{
		return LETTERS.indexOf(ch)/3;
	}
	
	static public int hash(Object key)
	{
		String s = (String)key;
		return v(s.charAt(0)) + 2 * v(s.charAt(1));
	}

}
