/************************************************
 * 제목 : 온도 변환기
 * 작성일 : 2018-03-13
 * 작성자 : 김용환
 * 참고 : F = 9C/5+32
 * 		C = 5(F-32)/9
 ************************************************/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2)
			exit();
		
		double value = Double.parseDouble(args[0]);
		char scale = Character.toUpperCase(args[1].charAt(0));
		
		if(scale != 'C' && scale != 'F')
			exit();
		
		
		
		Temperature temperature = new MyTemperature(value, scale,5);
		System.out.println(temperature);
		
	}
	
	private static void exit() {
		System.exit(0);
	}
}
