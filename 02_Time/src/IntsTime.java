
public class IntsTime implements Time{
	
	private int hour, minute, second;
	
	public IntsTime(int hour, int minute, int second)
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return (hour*60*60)+(minute*60)+second;
	}

	@Override
	public void setHour(int hour) {
		// TODO Auto-generated method stub
		this.hour = hour;
	}

	@Override
	public void setMinute(int minute) {
		// TODO Auto-generated method stub
		this.minute = minute;
	}

	@Override
	public void setSecond(int second) {
		// TODO Auto-generated method stub
		this.second = second;
	}
	
	public String toString()
	{
		return getTime() + "√ ";
	}

}
