/************************************************
 * 제목 : 온도 변환기
 * 작성일 : 2018-03-13
 * 작성자 : 김용환
 * 참고 : F = 9C/5+32
 * 		C = 5(F-32)/9
 ************************************************/
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new MyTemperature(0,40,4);
		t.print();
		
	}
}
