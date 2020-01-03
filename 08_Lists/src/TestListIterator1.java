import java.util.*;
import java.util.ListIterator;

public class TestListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries = {"AT","DE","ES","FR"};
		List list = (List) Arrays.asList(countries);
		
		System.out.println("list : " + list);
		
		java.util.ListIterator it = (ListIterator) list.listIterator();
		
		System.out.println("it.nextIndex() " + it.nextIndex());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.nextIndex() " + it.nextIndex());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.nextIndex() " + it.nextIndex());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.previousIndex(): " + it.previousIndex());;
		System.out.println("it.previous(): " + it.previous());
		System.out.println("it.previousIndex(): " + it.previousIndex());;
		System.out.println("it.previous(): " + it.previous());
	}

}
