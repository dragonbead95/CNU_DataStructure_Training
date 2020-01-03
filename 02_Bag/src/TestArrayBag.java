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
			System.out.println("추가, 삭제, 내용 출력, 사이즈 출력, 해당 내용 있는지 확인하는 시스템입니다.");
			System.out.print("1:추가  2:삭제  3:내용 출력  4:사이즈 출력  5:해당 내용 확인");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number==1)
			{
				System.out.print("추가하고 싶은 내용을 입력하세요 : ");
				content = scan.next();
				bag.add(content);
			}
			else if(number==2)
			{
				System.out.print("삭제하고 싶은 내용을 입력하세요 : ");
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
				System.out.print("해당 내용이 있는지 확인하고픈 내용을 입력하세요 : ");
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
		System.out.println("\n 가방 안에 들어있는 내용입니다.");
		System.out.print(bag.getFirst());
		for(int i=1;i<bag.size();i++)
		{
			System.out.print(", " + bag.getNext());
		}
		System.out.println();
		System.out.println();
	}
}
