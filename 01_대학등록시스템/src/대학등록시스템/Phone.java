package 대학등록시스템;

public class Phone {
	private String areaCode, number;
	
	public Phone(Phone that)
	{
		this.areaCode = that.areaCode;
		this.number = that.number;
	}
	public Phone(String areaCode, String number)
	{
		this.areaCode = areaCode;
		this.number = number;
	}
	
	public void setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
	}
	
	public String getareaCode()
	{
		return areaCode;
	}
	
	public String getnumber()
	{
		return number;
	}
}
