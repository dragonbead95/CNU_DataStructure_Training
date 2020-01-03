
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object arr[] = {1,2,3};
		Object arr2[] = {4};
		//TestArrayBag test = new TestArrayBag();
		//test.run();
		
		Bag bag1 = new ArrayBag(arr);
		Bag bag2 = new ArrayBag(arr2);
		
		System.out.println(bag1.other_contains(bag2));
	}

}
