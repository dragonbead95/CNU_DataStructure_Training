
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
		System.out.println("코인의 모든 갯수 : "+p.totalNumCoins());
		System.out.println("모든 코인값 : " + p.totalvalue());
		
	}

}
