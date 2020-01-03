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
			System.out.println("1.[Queue] 내용추가");
			System.out.println("2.[Queue] 내용 N개 삭제");
			System.out.println("3.[Queue] 내용 하나 삭제");
			System.out.println("4.[Queue] 사이즈 출력");
			System.out.println("5.[Queue] 내용 출력");
			System.out.println("6.[Queue] 첫번째 값 출력");
			System.out.println("7.[Queue] 종료");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)
			{
				System.out.println("추가하고 싶은 내용 : ");
				item = sc.next();
				queue.add(item);
			}else if(number==2)
			{
				System.out.println("삭제하고 싶은 갯수 : ");
				del_number = sc.nextInt();
				sc.nextLine();
				
				for(int i=0;i<del_number;i++)
				{
					item = queue.remove();
					System.out.println("["+item+"]가 삭제 되었습니다.");
				}
			}else if(number==3)
			{
				item = queue.remove();
				System.out.println("["+item+"]가 삭제 되었습니다.");
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
				System.out.println("1~7의 숫자를 입력해주세요");
				continue;
			}
		}
	}
}
