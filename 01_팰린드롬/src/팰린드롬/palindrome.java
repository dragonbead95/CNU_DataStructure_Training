package �Ӹ����;

public class palindrome {
	
	public boolean palindrome_jugment(StringBuffer str)
	{
		String str2 = str.toString();			// ���ڿ� ����
		String str3 = str.reverse().toString();	// ���ڿ��� ������ ���ڿ�
		if(str2.equals(str3)==true)
			return true;
		else
			return false;
		
	}
}
