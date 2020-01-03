import java.text.DecimalFormat;

public class MyTemperature implements Temperature{
	private double celsius;
	private int r;
	
	private String s;
	private String pattern;
	private DecimalFormat fmt;
	
	public MyTemperature(double value, char scale,int r)
	{
		setRound(r);
		
		
		
		if(scale == 'C' || scale == 'c')
		{
			setCelsius(value);
		}else if(scale=='F' || scale =='f')
		{
			setFahrenheit(value);
		}else
		{
			System.exit(0);
		}
	}
	
	@Override
	public double getCelsius() {
		// TODO Auto-generated method stub
		return celsius;
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

	@Override
	public void setFahrenheit(double fahrenheit) {
		// TODO Auto-generated method stub
		this.celsius = 5*(fahrenheit-32)/9;
	}
	
	// 출려 설정
	public String toString()
	{
		fmt = setDecimalFormat(s, pattern, fmt);
		
		return fmt.format(getCelsius()) + " C= " + fmt.format(getFahrenheit()) + " F";
	}
	
	private double round(double x,int r)
	{
		return Math.round(Math.pow(10, r)*x)/Math.pow(10, r);
	}

	@Override
	public void setRound(int r) {
		// TODO Auto-generated method stub
		this.r = r;
	}

	@Override
	public DecimalFormat setDecimalFormat(String s, String pattern, DecimalFormat fmt) {
		// TODO Auto-generated method stub
		s = "###,###,###,###.################";
		pattern = new String(s.toCharArray(),0,16+r);
		fmt = new DecimalFormat(pattern);
		
		return fmt;
	}
}
