
public interface Date {
	public int getDay();	// �ϼ� ��ȯ
	public int getMonth();	// �� ��ȯ
	public int getYear();	// �� ��ȯ	
	public void setDay(int day);	// �ϼ� ����
	public void setMonth(int month);	// �� ����
	public void setYear(int year);		// ���� ����
	
	public void addDay(int day);	// �Ű����� ��ŭ ��¥�� ������Ű�� �޼���
	public int getDate(IntsDate d);	// �� �Ű������� ���̸� �� ���� �����ϴ� �޼���
	public boolean getleap(int year);	// �������� �ƴ��� ��ȯ�ϴ� �޼���
	public int overday();	// ����� �ϼ� ���
	
}
