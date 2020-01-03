import javax.management.RuntimeErrorException;

public class ArrayCollection extends AbstractCollection {
	private final int INITIAL_LENGTH = 16;
	private int size;
	private Object[] a = new Object[INITIAL_LENGTH];
	
	public boolean add(Object object) {
		if(size==a.length)
			resize();
		a[size++] = object;
		return true;
	}
	
	public Iterator iterator()
	{
		return new Iterator() {
			private int i=0;
			private boolean okToRemove=false;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return (i<size);
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				if(i==size) throw new RuntimeErrorException(null);
				okToRemove = true;
				return a[i++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				if(!okToRemove) throw new IllegalStateException();
				a[--i] = a[--size];
				a[size] = null;
				okToRemove = false;
			}
		};
	}
	
	public int size()
	{
		return size;
	}
	
	public void resize()
	{
		Object[] aa = new Object[a.length*2];
		System.arraycopy(a, 0, aa, 0, size);
		a = aa;
	}
	
}
