
public class MyTemperature implements Temperature{
	private double celsius;
	private double celsius_F;
	private double celsius_L;
	private double increment;

	public MyTemperature(double celsius_F, double celsius_L, double increment)
	{
		this.celsius_F = celsius_F;
		this.celsius_L = celsius_L;
		this.increment = increment;
	}

	@Override
	public double getFahrenheit() {
		// TODO Auto-generated method stub
		return 9*celsius/5 + 32.0;
	}

	@Override
	public void setCelsius(double celsius) {
		// TODO Auto-generated method stub
		this.celsius = celsius;
	}
	
	// 증분 출력 설정
	public void print()
	{
		double i;
		
		for(i=celsius_F;i<=celsius_L;i+=increment)
		{
			setCelsius(i);
			System.out.println(Math.round(i) + "\t" + Math.round(getFahrenheit()));
		}
	}

	

	
}
