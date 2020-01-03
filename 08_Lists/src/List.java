import java.util.*;
public interface List extends Collection {
	public boolean add(Object object);
	public void add(int index, Object object);
	public boolean addAll(Collection collection);
	public void clear();
	public boolean contains(Object object);
	public boolean containsAll(Collection collection);
	public boolean equals(Object object);
	public Object get(int index);
	public int hashCode();
	public int indexOf(Object object);
	public boolean isEmpty();
	public Iterator iterator();
	public int lastIndexOf(Object object);
	public ListIterator listIterator();
	public ListIterator	listIterator(int index);
	public Object remove(int index);
	public boolean remove(Object object);
	public boolean removeAll(Collection collection);
	public boolean retainAll(Collection collection);
	public Object set(int index, Object object);
	public int size();
	public List subList(int index1, int index2);
	public Object[] toArray();
	public Object[] toArray(Object[] objects);
}
