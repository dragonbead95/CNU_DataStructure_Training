import java.text.DecimalFormat;

public interface Temperature {
	public double getCelsius();						// 섭씨 온도를 반환
	public double getFahrenheit();					// 화씨 온도를 반환
	public void setCelsius(double celsius);			// 섭씨 온도 설정
	public void setFahrenheit(double fahrenheit);	// 화씨 온도 설정
	public void setRound(int r);					// 소수점 자릿수 설정
	public DecimalFormat setDecimalFormat(String s, String pattern,DecimalFormat fmt);	// 자릿수 포맷설정
}
