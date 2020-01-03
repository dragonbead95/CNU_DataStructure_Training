import java.text.DecimalFormat;

public interface Distance {
	public double getKillometer();	// 킬로미터 반환
	public double getMile();		// 마일 반환
	public void setKillometer(double mile);	// 킬로미터 설정
	public void setMile(double killometer);			// 마일 설정
	public DecimalFormat setDecimalFormat(String s, String pattern,DecimalFormat fmt);	// 자릿수 포맷설정
}
