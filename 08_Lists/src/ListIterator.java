import java.util.Iterator;

public interface ListIterator extends Iterator {
	public void add(Object object);
	public boolean hasNext();
	public boolean hasPrevious();
	public Object next();
	public int nextIndex();
	public Object previousIndex();
	public void remove();
	public void set(Object object);
}
