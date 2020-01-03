import java.text.DecimalFormat;

public class myDistance implements Distance {
	private double killometer;
	private double mile;
	private static final double K_TO_M = 3280.0/5280;
	
	private String s;
	private String pattern;
	private DecimalFormat fmt;
	
	public myDistance(double value,char scale) {
		// TODO Auto-generated constructor stub
		
		if(scale=='K' || scale=='k')
		{
			this.killometer = value;
			setMile(value);
		}
		else if(scale=='M' || scale=='m')
		{
			this.mile = value;
			setKillometer(value);
		}
		else
			System.exit(0);
	}
	
	@Override
	public double getKillometer() {
		// TODO Auto-generated method stub
		return killometer;
	}

	@Override
	public double getMile() {
		// TODO Auto-generated method stub
		return mile;
	}

	@Override
	public void setKillometer(double mile) {
		// TODO Auto-generated method stub
		killometer = mile/K_TO_M;
	}

	@Override
	public void setMile(double killometer) {
		// TODO Auto-generated method stub
		mile = killometer * K_TO_M;
	}
	
	public String toString()
	{
		fmt = setDecimalFormat(s, pattern, fmt);
		
		return "킬로미터 : " + fmt.format(getKillometer()) + " 마일 : " + fmt.format(getMile());
	}
	
	@Override
	public DecimalFormat setDecimalFormat(String s, String pattern, DecimalFormat fmt) {
		// TODO Auto-generated method stub
		s = "###,###,###,###.################";
		pattern = new String(s.toCharArray(),0,16+4);
		fmt = new DecimalFormat(pattern);
		
		return fmt;
	}


}
