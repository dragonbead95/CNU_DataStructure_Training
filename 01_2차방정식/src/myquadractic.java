
public class myquadractic {
	
	public void quadratic_equation(double a, double b, double c)
	{
		double d,e;
		
		if(a==0)
		{
			System.out.println(-c/b);
		}else {
			d=b*b - 4.0*a*c;	//������
			if(d>0)
			{
				e = Math.sqrt(d);
				System.out.println("�� ���� �� : " + (-b+e)/(2.0*a) + " " + (-b-e)/(2.0*a));	// �ΰ��� ��
			}else {
				if(d==0)
				{
					System.out.println((-b)/(2.0*a));	// �Ѱ��� ��
				}else {
					System.out.println("���� �����ϴ�.");
				}
			}
		}
	}
}
