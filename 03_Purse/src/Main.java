
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purse p = new ArrayPurse();
		
		p.addNumCoinsOf(0, 5);
		p.addNumCoinsOf(1, 2);
		p.addNumCoinsOf(2, 3);
		p.addNumCoinsOf(3, 5);
		
		for(int i=0;i<4;i++)
		{
			System.out.print(p.getAmount(i) + " ");
			System.out.println(p.getNumCoinsOf(i) + " ");
		}
		System.out.println();
		System.out.println("������ ��� ���� : "+p.totalNumCoins());
		System.out.println("��� ���ΰ� : " + p.totalvalue());
		
	}

}
