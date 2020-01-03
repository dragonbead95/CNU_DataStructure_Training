
public interface Date {
	public int getDay();	// 일수 반환
	public int getMonth();	// 달 반환
	public int getYear();	// 년 반환	
	public void setDay(int day);	// 일수 설정
	public void setMonth(int month);	// 달 설정
	public void setYear(int year);		// 연도 설정
	
	public void addDay(int day);	// 매개변수 만큼 날짜를 증가시키는 메서드
	public int getDate(IntsDate d);	// 두 매개변수의 차이를 일 수로 리턴하는 메서드
	public boolean getleap(int year);	// 윤년인지 아닌지 반환하는 메서드
	public int overday();	// 경과된 일수 계산
	
}
