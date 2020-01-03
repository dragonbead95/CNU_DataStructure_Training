
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = null;
		BinarySearch b = new BinarySearch(a);
		b.makeArray(4);
		b.sort();
		b.print();
		System.out.println();
		System.out.println(b.search(5));
		
	}

}
