
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
	
	// �� ������ �ε��� i�� ��ġ�� ���Ҹ� ����
	public Object elementAt(int i)
	{
		return objects[i];
	}
	
	// �� ������ ù ��° ���Ҹ� ����
	public Object firstElement()
	{
		return objects[0];
	}
	
	// �� ������ ������ ���Ҹ� ����.
	public Object lastElement()	
	{
		return objects[size-1];
	}
	
	// �ε��� i�� ���Ҹ� x�� ��ü
	public void setElementAt(Object x, int i)
	{
		objects[i] = x;
	}
	
	// �� ������ �ε��� i�� ��ġ�� ���Ҹ� ����
	public Object get(int i)
	{
		return objects[i];
	}
	
	// �ε��� i�� ���Ҹ� x�� ��ü
	public Object set(int i, Object x)
	{
		return objects[i] = x;		
	}
	
	// �� ������ ���� x�� ÷���ϰ� ���� ����
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
	
	// �� ���Ϳ��� x�� ù ��° ��Ŀ������ �����ϰ�, �� �ڿ� ��� ���Ҹ�
	// �� ��ġ�� ������ �̵�, x�� �߰ߵǰ� ���� �Ǿ����� ���� ����
	// �׷��� ������ ����
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
	
	//x�� �ε��� i�� �����ϰ�, �� ��ġ���� �ǳ������� ���ҵ���
	//�� �ڸ��� �ڷ� �̵�
	public void add(int i, Object x)
	{
		System.arraycopy(objects, i, objects, i+1, size-i);
		size++;
		objects[i] = x;
	}
	
	// �ε��� I�� ���Ҹ� �����ϰ�, �� ���� ��� ���ҵ��� �� �ڸ��� ������ �̵�.
	// ���ŵ� ��ü�� ����.
	public Object remove(int i)
	{
		Object temp = objects[i];
		System.arraycopy(objects, i+1, objects, i, size-i-1);
		size--;
		return temp;
	}
	
}
