package 팰린드롬;

public class palindrome {
	
	public boolean palindrome_jugment(StringBuffer str)
	{
		String str2 = str.toString();			// 문자열 원본
		String str3 = str.reverse().toString();	// 문자열을 뒤집은 문자열
		if(str2.equals(str3)==true)
			return true;
		else
			return false;
		
	}
}
