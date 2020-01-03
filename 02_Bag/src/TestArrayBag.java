import java.util.Scanner;

public class TestArrayBag {
	Object objects[];
	public TestArrayBag(Object object[])
	{
		this.objects = object;
	}
	
	public void run()
	{
		Bag bag = new ArrayBag(objects);
		Scanner scan = new Scanner(System.in);
		int number;
		String content;
		
		while(true)
		{
			System.out.println("�߰�, ����, ���� ���, ������ ���, �ش� ���� �ִ��� Ȯ���ϴ� �ý����Դϴ�.");
			System.out.print("1:�߰�  2:����  3:���� ���  4:������ ���  5:�ش� ���� Ȯ��");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number==1)
			{
				System.out.print("�߰��ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				bag.add(content);
			}
			else if(number==2)
			{
				System.out.print("�����ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				bag.remove(content);
			}
			else if(number==3)
			{
				this.print(bag);
			}
			else if(number==4)
			{
				System.out.println(bag.size());
			}
			else if(number==5)
			{
				System.out.print("�ش� ������ �ִ��� Ȯ���ϰ��� ������ �Է��ϼ��� : ");
				content = scan.next();
				bag.contains(content);
			}else {
				break;
			}
			System.out.println();
		}
	}

	public void print(Bag bag)
	{
		System.out.println("\n ���� �ȿ� ����ִ� �����Դϴ�.");
		System.out.print(bag.getFirst());
		for(int i=1;i<bag.size();i++)
		{
			System.out.print(", " + bag.getNext());
		}
		System.out.println();
		System.out.println();
	}
}
