
public class Country {
	public String name, language;
	public int code,population;
	
	public Country(String n, String l,int c, int p)
	{
		name = n;
		language = l;
		code = c;
		population = p;
	}
	
	public String toString()
	{
		return "("+name+" , "+language + code + " , " + population+")";
	}
}
