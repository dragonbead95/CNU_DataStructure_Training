package 자물쇠;

public interface lock {
	public void locked_set();							// 자물쇠 설정
	public void locked();								// 자물쇠 잠금
	public void unlocked();								// 자물쇠 해제
	public void option();								// 선택 옵션
	public long getId();								// id 반환
}
