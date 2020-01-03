import java.text.DecimalFormat;

public interface Temperature {
	public double getCelsius();						// ���� �µ��� ��ȯ
	public double getFahrenheit();					// ȭ�� �µ��� ��ȯ
	public void setCelsius(double celsius);			// ���� �µ� ����
	public void setFahrenheit(double fahrenheit);	// ȭ�� �µ� ����
	public void setRound(int r);					// �Ҽ��� �ڸ��� ����
	public DecimalFormat setDecimalFormat(String s, String pattern,DecimalFormat fmt);	// �ڸ��� ���˼���
}
