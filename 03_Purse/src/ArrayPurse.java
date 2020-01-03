
public class ArrayPurse implements Purse {
	
	private int poket[] = new int[4];	// 1,5,10,25센트 지갑
	private String amount[] = {"pennies","nickels","dimes","quarters"};
	private double total_value=0;
	
	@Override
	public int getNumCoinsOf(int coin) {
		// TODO Auto-generated method stub
		switch(coin)
		{
		case 0: return poket[0]; 
		case 1: return poket[1]/5;
		case 2: return poket[2]/10;
		case 3: return poket[3]/25;
		default: System.out.println("0~3사이의 코인을 입력해주세요"); return 0;
		}
	}

	@Override
	public void addNumCoinsOf(int coin, int value) {
		// TODO Auto-generated method stub
		if(coin<0 || coin>4)
			System.out.println("0~3의 정수를 입력해주세요");
		else
			switch(coin)
			{
			case 0: poket[0] = value; break;
			case 1: poket[1] = value*5; break;
			case 2: poket[2] = value*10; break;
			case 3: poket[3] = value*25; break;
			}
	}

	@Override
	public int totalNumCoins() {
		// TODO Auto-generated method stub
		return ((poket[0])+
				(poket[1]/5)+
				(poket[2]/10)+
				(poket[3]/25));
	}

	@Override
	public double totalvalue() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
			total_value += poket[i];
		return total_value;
	}

	@Override
	public String getAmount(int i) {
		// TODO Auto-generated method stub
		return amount[i];
	}

}
