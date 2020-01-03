import java.util.*;
public class TestHashTable {
	Scanner sc = new Scanner(System.in);
	HashTable ht = new HashTable(10);	// �ؽ� ���̺� ũ��� ������ �ʱ�ȭ
	Object key;	// Ű��
	String n,l;	// country ��ü�� name, language �Էº���
	int number;	// ���� �Է� ����
	
	public void run()
	{
		while(true)
		{
			System.out.println("1. [Hash] put");
			System.out.println("2. [Hash] get");
			System.out.println("3. [Hash] remove");
			System.out.println("4. [Hash] print");
			System.out.println("5. [Hash] ����");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// put ���
			{
				System.out.println("key�� �Է��ϼ��� : ");
				key = sc.next();
				
				System.out.println("������ �Է��ϼ��� : ");
				n = sc.next();
				
				System.out.println("�� �Է��ϼ��� : ");
				l = sc.next();				
				
				ht.put(key, new Country(n,l));
			}else if(number==2)	// get ���
			{
				System.out.println("key�� �Է��ϼ��� : ");
				key = sc.next();
				System.out.println(ht.get(key));
			}else if(number==3)	// ���� ���
			{
				System.out.println("������ key�� �Է��ϼ��� : ");
				key = sc.next();
				System.out.println(ht.remove(key));
			}else if(number==4) {			// ���� ���
				ht.print();
			}
		}
	}
}
