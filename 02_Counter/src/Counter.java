/**
 * ADT: Counter
void countPlus()
 ������ : �־��� ��ü�� 1�� �����Ѵ�.

void countReset()
 ������ : �־��� ��ü�� count�� 0���� �����ȴ�.

int getcount()
 ���� : count ���� ��ȯ��

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
 * @author ���ȯ
 *
 */
public interface Counter {
	public void countPlus();	//count �ʵ尪�� 1 ������Ŵ
	public void countReset();	//count �ʵ尪�� 0���� �ʱ�ȭ
	public int getCount();		//count �ʵ尪 ��ȯ
}
