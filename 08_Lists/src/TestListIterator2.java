import java.util.*;
import java.util.ListIterator;

public class TestListIterator2 {
	public static void main(String[] args)
	{
		List list = (List) Arrays.asList(new String[] {"AT","DE","ES","FR"});
		System.out.println("list: " + list);
		
		java.util.ListIterator it = (ListIterator) list.listIterator();
		System.out.println("it.next():" + it.next());
		System.out.println("it.next():" + it.next());
		System.out.println("it.previous():" + it.previous());
		System.out.println("it.next():" + it.next());
		System.out.println("it.next():" + it.next());
		System.out.println("it.previous():" + it.previous());
		System.out.println("it.previous():" + it.previous());
		System.out.println("it.previous():" + it.previous());
		System.out.println("it.hasprevious():" + it.hasPrevious());
		System.out.println("it.hasNext():" + it.hasNext());
	}
}
