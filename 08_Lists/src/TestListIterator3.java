import java.util.*;
import java.util.ListIterator;

public class TestListIterator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries = {"AT","DE","ES","FR"};
		List list = (List) Arrays.asList(countries);
		System.out.println("list : " + list);
		
		java.util.ListIterator it = (ListIterator) list.listIterator();
		
		it.next();
		it.next();
		it.set("CZ");
		System.out.println("list: "+list);
		System.out.println("countires[1]:" + countries[1]);
		countries[3] = "GB";
		System.out.println("list: " + list);
	}

}
