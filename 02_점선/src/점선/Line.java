package 점선;

public interface Line {
	public void setLine(myPoint p1, myPoint p2);	// 라인 설정
	public Point getPoint1();			// 포인터1 좌표 반환
	public Point getPoint2();			// 포인터2 좌표 반환
}
