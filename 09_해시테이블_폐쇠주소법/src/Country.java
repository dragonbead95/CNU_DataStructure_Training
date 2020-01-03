
public class Country {
	public String name, language;
	public int area, population;
	
	public Country(String n, String l, int a, int p)
	{
		this.name =n;
		this.language = l;
		this.area = a;
		this.population = p;
	}
	
	public String toString()
	{
		return "(" + name + "," + language + "," + area + "," + population + ")";
	}
}
