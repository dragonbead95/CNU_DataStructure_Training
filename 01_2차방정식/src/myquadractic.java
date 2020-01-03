
public class myquadractic {
	
	public void quadratic_equation(double a, double b, double c)
	{
		double d,e;
		
		if(a==0)
		{
			System.out.println(-c/b);
		}else {
			d=b*b - 4.0*a*c;	//방정식
			if(d>0)
			{
				e = Math.sqrt(d);
				System.out.println("두 개의 근 : " + (-b+e)/(2.0*a) + " " + (-b-e)/(2.0*a));	// 두개의 근
			}else {
				if(d==0)
				{
					System.out.println((-b)/(2.0*a));	// 한개의 근
				}else {
					System.out.println("근이 없습니다.");
				}
			}
		}
	}
}
