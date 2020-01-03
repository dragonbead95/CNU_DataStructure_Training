
public class Vector {
	protected Object[] objects;
	protected int size;
	protected static final int CAPACITY=10;
	
	
	public void resized()
	{
		int n=objects.length;
		Object[] temp=new Object[2*n];
		System.arraycopy(objects, 0, temp, 0, n);
		objects = temp;
	}
	
	public Vector(Object[] a)
	{
		int n = a.length;
		objects = new Object[2*n];
		System.arraycopy(a, 0, objects, 0, n);
		size = n;
	}
	
	
	public Vector(int capacity)
	{
		if(capacity<=0)
			new IllegalArgumentException("capacity<=0");
		objects = new Object[capacity];
	}
	
	public Vector()
	{
		this(CAPACITY);
	}
	
	public int size()
	{
		return size;
	}
	
	public String toString()
	{
		if(size==0)
			return "()";
		
		StringBuffer buf = new StringBuffer("("+objects[0]);
		for(int i=1;i<size;i++)
			buf.append(","+objects[i]);
		
		return buf+")";
	}
	
	public void copyInto(Object[] aa)
	{
		Object n = aa.length;
		aa[0] = n;
	}
	
	public void trimToSize()
	{
		int n = objects.length;
		Object temp[] = new Object[size];
		
		for(int i=0;i<size;i++)
		{
			temp[i] = objects[i];
		}
		
		objects = new Object[n/2];
		
		for(int i=0;i<size;i++)
		{
			objects[i] = temp[i];
		}
	}
	
	public void ensureCapacity(int n)
	{
		Object[] temp = new Object[n];
		
		for(int i=0;i<n;i++)
		{
			temp[i] = objects[i];
		}
		
		objects = temp.clone();
		size = n;
	}
	
	public int indexOf(Object x)
	{
		int min_index=-1;
		
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(x))
			{
				if(min_index == -1)
				{
					min_index = i;
				}
			}
		}
		return min_index;
	}
	
	public boolean contains(Object x)
	{
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(x))
			{
				return true;
			}
		}
		return false;
	}
	
	// 이 벡터의 인덱스 i에 위치한 원소를 리턴
	public Object elementAt(int i)
	{
		return objects[i];
	}
	
	// 이 벡터의 첫 번째 원소를 리턴
	public Object firstElement()
	{
		return objects[0];
	}
	
	// 이 벡터의 마지막 원소를 리턴.
	public Object lastElement()	
	{
		return objects[size-1];
	}
	
	// 인덱스 i의 원소를 x로 대체
	public void setElementAt(Object x, int i)
	{
		objects[i] = x;
	}
	
	// 이 벡터의 인덱스 i에 위치한 원소를 리턴
	public Object get(int i)
	{
		return objects[i];
	}
	
	// 인덱스 i의 원소를 x로 대체
	public Object set(int i, Object x)
	{
		return objects[i] = x;		
	}
	
	// 이 벡터의 끝에 x를 첨가하고 참을 리턴
	public boolean add(Object x)
	{
		if(contains(x))
		{
			return false;
		}else {
			objects[size++] = x;
			return true;	
		}	
	}
	
	// 이 벡터에서 x의 첫 번째 어커런스를 삭제하고, 그 뒤에 모든 원소를
	// 한 위치씩 앞으로 이동, x가 발견되고 제거 되었으면 참을 리턴
	// 그렇지 않으면 리턴
	public boolean remove(Object x)
	{
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(x))
			{
				System.arraycopy(objects, i, objects, i-1, size-i-1);
				size--;
				return true;
			}
		}
		return false;
	}
	
	//x를 인덱스 i에 삽입하고, 그 위치부터 맨끝까지의 원소들을
	//한 자리씩 뒤로 이동
	public void add(int i, Object x)
	{
		System.arraycopy(objects, i, objects, i+1, size-i);
		size++;
		objects[i] = x;
	}
	
	// 인덱스 I의 원소를 삭제하고, 그 뒤의 모든 원소들을 한 자리씩 앞으로 이동.
	// 제거된 객체를 리턴.
	public Object remove(int i)
	{
		Object temp = objects[i];
		System.arraycopy(objects, i+1, objects, i, size-i-1);
		size--;
		return temp;
	}
	
}
