package 대학등록시스템;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone("804","3790550");
		
		Person john = new Person("John Adams",true,1980,p);
		System.out.println(john);
	}

}
