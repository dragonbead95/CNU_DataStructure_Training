import java.text.DecimalFormat;

public interface Distance {
	public double getKillometer();	// ų�ι��� ��ȯ
	public double getMile();		// ���� ��ȯ
	public void setKillometer(double mile);	// ų�ι��� ����
	public void setMile(double killometer);			// ���� ����
	public DecimalFormat setDecimalFormat(String s, String pattern,DecimalFormat fmt);	// �ڸ��� ���˼���
}
