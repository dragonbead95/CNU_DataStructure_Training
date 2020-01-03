/**
 * ADT: Counter
void countPlus()
 후조건 : 주어진 객체가 1씩 증가한다.

void countReset()
 후조건 : 주어진 객체의 count는 0으로 설정된다.

int getcount()
 리턴 : count 값을 반환함

UML : Counter
Counter
------------
-count:int
------------
+countPlus()
+countReset()
+getcount():int

interface
public void countPlus()
public void countReset()
public int getCount()
 * @author 김용환
 *
 */
public interface Counter {
	public void countPlus();	//count 필드값을 1 증가시킴
	public void countReset();	//count 필드값을 0으로 초기화
	public int getCount();		//count 필드값 반환
}
