

public interface Purse {
	public int getNumCoinsOf(int coin);				// 코인종류의 갯수
	public void addNumCoinsOf(int coin, int value);	// 코인종류와 코인값 추가
	public int totalNumCoins();						// 코인한종류의 합계값 반환
	public double totalvalue();						// 모든 코인값의 합계값 반환
	public String getAmount(int i);						// 화폐단위 반환
}
