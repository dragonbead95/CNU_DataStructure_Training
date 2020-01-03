
public class IntsDate implements Date{
	private int day,month,year;
	
	public IntsDate(int year, int month, int day)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	@Override
	public int getDay() {
		// TODO Auto-generated method stub
		return day;
	}

	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return month;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public void setDay(int day) {
		// TODO Auto-generated method stub
		if(day<1 || day>31) 
				throw new IllegalArgumentException();
		this.day = day;
	}

	@Override
	public void setMonth(int month) {
		// TODO Auto-generated method stub
		if(month<1 || month>12) 
			throw new IllegalArgumentException();
		this.month=month;
	}

	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		if(year<1700 || year>2100)
			throw new IllegalArgumentException();
		this.year = year;
	}
	@Override
	public void addDay(int day) {
		// TODO Auto-generated method stub
		this.day += day;
	}
	@Override
	public int getDate(IntsDate d) {
		// TODO Auto-generated method stub
		return Math.abs((year*365+month*31+day)-(d.year*365+d.month*31+d.day));
		
	}
	@Override
	public boolean getleap(int year) {
		// TODO Auto-generated method stub
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	@Override
	public int overday() {
		// TODO Auto-generated method stub
		switch(month)
		{
		case 1: month = 0;break;
		case 2: month = 31; break;
		case 3: month = 31+28; break;
		case 4: month = 31+28+31; break;
		case 5: month = 31+28+31+30; break;
		case 6: month = 31+28+31+30+31; break;
		case 7: month = 31+28+31+30+31+30; break;
		case 8: month = 31+28+31+30+31+30+31; break;
		case 9: month = 31+28+31+30+31+30+31+31; break;
		case 10: month = 31+28+31+30+31+30+31+31+30; break;
		case 11: month = 31+28+31+30+31+30+31+31+30+31; break;
		case 12: month = 31+28+31+30+31+30+31+31+30+31+30; break;
		default : return -1;
		}
		return (((year-1700)*365)+month+day);
	}
	
}
