

public interface Purse {
	public int getNumCoinsOf(int coin);				// ���������� ����
	public void addNumCoinsOf(int coin, int value);	// ���������� ���ΰ� �߰�
	public int totalNumCoins();						// ������������ �հ谪 ��ȯ
	public double totalvalue();						// ��� ���ΰ��� �հ谪 ��ȯ
	public String getAmount(int i);						// ȭ����� ��ȯ
}
