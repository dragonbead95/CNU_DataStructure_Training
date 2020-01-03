import java.sql.Time;

public class myAlarmClock implements AlarmClock{
	private Time c_time;
	private Time a_time;
	
	@Override
	public void setCurrentTime(Time time) {
		// TODO Auto-generated method stub
		this.c_time = time;
	}

	@Override
	public Time getCurrentTime() {
		// TODO Auto-generated method stub
		return c_time;
	}

	@Override
	public void setAlarmTime(Time time) {
		// TODO Auto-generated method stub
		this.a_time = time;
	}

	@Override
	public Time getAlarmTime() {
		// TODO Auto-generated method stub
		return a_time;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void advanceCurrentTime() {
		// TODO Auto-generated method stub
		c_time.setSeconds((c_time.getSeconds()+1));
	}

	@Override
	public boolean isAlarmTime() {
		// TODO Auto-generated method stub
		if(c_time.equals(a_time)==true)
		{
			return true;
		}else {
			return false;
		}
	}

}
