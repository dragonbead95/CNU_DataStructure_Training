package 대학등록시스템;

public class Person {
	protected final int yob;
	protected final boolean male;
	protected final String name;
	protected Phone phone;
	
	public Person(String name,boolean male, int yob,Phone phone)
	{
		this.name = name;
		this.male = male;
		this.yob = yob;
		this.phone = new Phone(phone);
		
	}
	
	public String getNmae()
	{
		return name;
	}
	
	public int getYob()
	{
		return yob;
	}
	
	public boolean isMale()
	{
		return male;
	}
	
	public String toString()
	{
		return name + " (" + yob + "), tel. (" + phone.getareaCode()  + ")" + phone.getnumber();  
	}
}
