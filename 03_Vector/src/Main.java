
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(args);
		
		v.add(1);
		System.out.println(v);
		v.add(3.5);
		System.out.println(v);
		
		Object a[] = {1,2.5,3,4};
		
		v.isHomogeneous(a);
		
		
	}

}
