
public class HashTableTest {
	public static void main(String args[])
	{
		HashTable test = new HashTable(10);
		test.put("AT", new Country("Austria","German",32378,8139299));
		test.put("FR", new Country("France","Franch",211200,58978172));
		test.put("DE", new Country("Germany","German",137800,82087361));
		test.put("GR", new Country("Greece","Greek",50900,10707130));
		test.put("IT", new Country("Italy","Italain",116300,56735130));
		test.put("PT", new Country("Portugal","Portugue",35672,9918040));
		test.put("SE", new Country("Sweden","Swedish",173732,8911296));
		
		System.out.println("GR : " + test.get("GR"));
		System.out.println("size : " + test.size());
		
		System.out.println("GR Remove : " + test.remove("GR"));
		System.out.println("GR : " + test.get("GR"));
		System.out.println("size : " + test.size());
	}
	
}
