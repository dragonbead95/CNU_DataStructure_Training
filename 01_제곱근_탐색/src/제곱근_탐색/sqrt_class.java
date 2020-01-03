package Á¦°ö±Ù_Å½»ö;

public class sqrt_class {
	double input,x;
	public double sqrt_seek(double input)
	{
		x=1;
		return SQRT(input,x);
	}
	
	public double SQRT(double input,double x)
	{
		for(int i=0;i<=50;i++)
		{
			x = (x+(input/x))/2;
		}
		return x;
	}
}
