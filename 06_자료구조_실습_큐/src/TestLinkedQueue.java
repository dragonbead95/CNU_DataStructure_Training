import java.util.Scanner;

public class TestLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}
	
	public static void run()
	{
		LinkedQueue queue = new LinkedQueue();
		Scanner sc = new Scanner(System.in);
		Object item;
		int number,del_number;
		while(true)
		{
			System.out.println("1.[Queue] �����߰�");
			System.out.println("2.[Queue] ���� N�� ����");
			System.out.println("3.[Queue] ���� �ϳ� ����");
			System.out.println("4.[Queue] ������ ���");
			System.out.println("5.[Queue] ���� ���");
			System.out.println("6.[Queue] ù��° �� ���");
			System.out.println("7.[Queue] ����");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)
			{
				System.out.println("�߰��ϰ� ���� ���� : ");
				item = sc.next();
				queue.add(item);
			}else if(number==2)
			{
				System.out.println("�����ϰ� ���� ���� : ");
				del_number = sc.nextInt();
				sc.nextLine();
				
				for(int i=0;i<del_number;i++)
				{
					item = queue.remove();
					System.out.println("["+item+"]�� ���� �Ǿ����ϴ�.");
				}
			}else if(number==3)
			{
				item = queue.remove();
				System.out.println("["+item+"]�� ���� �Ǿ����ϴ�.");
			}else if(number==4)
			{
				System.out.println(queue.size());
			}else if(number==5)
			{
				for(Node q = queue.getFront(); q!=null; q = q.getNext())
				{
					System.out.print(q.getData() + " ");
				}
				System.out.println();
			}else if(number==6)
			{
				System.out.println(queue.peek());
			}else if(number==7)
			{
				System.exit(0);
			}
			else {
				System.out.println("1~7�� ���ڸ� �Է����ּ���");
				continue;
			}
		}
	}
}
