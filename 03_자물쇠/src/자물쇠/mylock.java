package 자물쇠;
import java.util.*;

public class mylock implements lock{
	private int lock_number[] = new int[3];
	private int unlock_number[] = new int[3];
	Scanner sc = new Scanner(System.in);
	
	
	public final long id;	// 객체끼리 판독가능한 id 생성
	public static long idNext=1;	// 다음 id를 생성하는 변수
	
	{
		id = idNext++;	// id번호 자동생성
	}
	
	public void option()
	{
		
		while(true)
		{
			System.out.println("1:자물쇠 설정");
			System.out.println("2:자물쇠 해제");
			System.out.println("3:자물쇠 잠금");
			System.out.println("4:종료");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: locked_set(); break; //자물쇠 설정
			case 2: unlocked();   break; //자물쇠 해제
			case 3: locked();     break; //자물쇠 잠금
			case 4: System.exit(0);		 //종료
			default: System.out.println("잘못입력하셨습니다."); break;
			}
		}
		
	}
	
	public void unlocked()	// 자물쇠 해제
	{
		
		int count=0;
		System.out.print("0~36에서 정수 3개를 입력해주세요 ");
		
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
			System.out.println("자물쇠가 해제되었습니다.");
		}else {
			System.out.println("비밀번호가 틀립니다");
		}
	}
	
	// 자물쇠 설정
	public void locked_set()
	{
		System.out.print("0~36에서 정수 3개를 입력해주세요 ");
		int value;
		for(int i=0;i<lock_number.length;i++)
		{
			value = sc.nextInt();
			if(value>=0 && value<=32)
				lock_number[i] = value;
		}
	}
	
	// 자물쇠 잠금
	public void locked()
	{
		System.out.println("잠금되었습니다.");
	}
	
	public long getId()
	{
		return id;
	}
	
	
}
