import java.sql.Time;

public interface AlarmClock {
	public void setCurrentTime(Time time);	//현재시간 명세
	public Time getCurrentTime();		//저장된 현재시간 반환
	public void setAlarmTime(Time time);//알람시간 명세
	public Time getAlarmTime();			// 저장된 알람시간
	public void advanceCurrentTime();	//저장된 시간이 1초 전진함
	public boolean isAlarmTime();		// 현재시간과 알람 시간과 일치하면 참
}
