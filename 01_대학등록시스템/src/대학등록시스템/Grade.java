package ���е�Ͻý���;

public class Grade {
	private String value;	// �����ڿ��� �������� ���� ����
	
	/* Grade�� �����ڷ� value���� �����Ѵ�. */
	public Grade(String value)
	{
		this.value = value;
	}
	
	/*section�� ���� �������� ��ȯ�Ѵ�.*/
	public String getValue() {
		// TODO Auto-generated method stub
		return value; 
	}
	
	// map���� ���� �����͸� �����Ҷ� ��ȯ�� �޼ҵ�
	public String toString()
	{
		return value;
	}
}
