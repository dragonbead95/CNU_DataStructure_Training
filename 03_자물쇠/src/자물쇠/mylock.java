package �ڹ���;
import java.util.*;

public class mylock implements lock{
	private int lock_number[] = new int[3];
	private int unlock_number[] = new int[3];
	Scanner sc = new Scanner(System.in);
	
	
	public final long id;	// ��ü���� �ǵ������� id ����
	public static long idNext=1;	// ���� id�� �����ϴ� ����
	
	{
		id = idNext++;	// id��ȣ �ڵ�����
	}
	
	public void option()
	{
		
		while(true)
		{
			System.out.println("1:�ڹ��� ����");
			System.out.println("2:�ڹ��� ����");
			System.out.println("3:�ڹ��� ���");
			System.out.println("4:����");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: locked_set(); break; //�ڹ��� ����
			case 2: unlocked();   break; //�ڹ��� ����
			case 3: locked();     break; //�ڹ��� ���
			case 4: System.exit(0);		 //����
			default: System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
			}
		}
		
	}
	
	public void unlocked()	// �ڹ��� ����
	{
		
		int count=0;
		System.out.print("0~36���� ���� 3���� �Է����ּ��� ");
		
		for(int i=0;i<unlock_number.length;i++)
		{
			unlock_number[i] = sc.nextInt();
		}
		
		for(int i=0;i<unlock_number.length;i++)
		{
			if(unlock_number[i]==lock_number[i])
			{
				count++;
			}
		}
		
		if(count==lock_number.length)
		{
			System.out.println("�ڹ��谡 �����Ǿ����ϴ�.");
		}else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�");
		}
	}
	
	// �ڹ��� ����
	public void locked_set()
	{
		System.out.print("0~36���� ���� 3���� �Է����ּ��� ");
		int value;
		for(int i=0;i<lock_number.length;i++)
		{
			value = sc.nextInt();
			if(value>=0 && value<=32)
				lock_number[i] = value;
		}
	}
	
	// �ڹ��� ���
	public void locked()
	{
		System.out.println("��ݵǾ����ϴ�.");
	}
	
	public long getId()
	{
		return id;
	}
	
	
}
