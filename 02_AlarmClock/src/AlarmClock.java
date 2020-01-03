import java.sql.Time;

public interface AlarmClock {
	public void setCurrentTime(Time time);	//����ð� ��
	public Time getCurrentTime();		//����� ����ð� ��ȯ
	public void setAlarmTime(Time time);//�˶��ð� ��
	public Time getAlarmTime();			// ����� �˶��ð�
	public void advanceCurrentTime();	//����� �ð��� 1�� ������
	public boolean isAlarmTime();		// ����ð��� �˶� �ð��� ��ġ�ϸ� ��
}
