import java.sql.Date;
import java.sql.Time;

import javax.management.timer.Timer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmClock a = new myAlarmClock();
		java.util.Date d = new java.util.Date();
		Time t = new Time(d.getTime());
		Time t2 = new Time(d.getTime());
		
		a.setCurrentTime(t);
		System.out.println(a.getCurrentTime());
		
		a.setAlarmTime(t2);
		System.out.println(a.getAlarmTime());
		
		a.advanceCurrentTime();
		System.out.println(a.getCurrentTime());
		System.out.println(a.getAlarmTime());
		
		if(a.isAlarmTime())
		{
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
	}

}
