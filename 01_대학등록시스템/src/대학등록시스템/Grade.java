package 대학등록시스템;

public class Grade {
	private String value;	// 생성자에서 성적값을 받을 변수
	
	/* Grade의 생성자로 value값을 저장한다. */
	public Grade(String value)
	{
		this.value = value;
	}
	
	/*section에 대한 성적값을 반환한다.*/
	public String getValue() {
		// TODO Auto-generated method stub
		return value; 
	}
	
	// map에서 성적 데이터를 참조할때 반환할 메소드
	public String toString()
	{
		return value;
	}
}
