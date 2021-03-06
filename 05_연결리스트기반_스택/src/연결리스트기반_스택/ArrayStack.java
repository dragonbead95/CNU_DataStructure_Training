package 연결리스트기반_스택;

public class ArrayStack implements Stack {
	private Object[] a;
	private int size;
	
	public ArrayStack(int capacity)
	{
		a = new Object[capacity];
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(size==0) throw new IllegalArgumentException();
		
		return a[size-1];
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(size==0) throw new IllegalArgumentException();
		
		Object object = a[--size];
		a[size]=null;
		return object;
	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub
		if(size==a.length) resize();
		a[size++] = object;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void resize()
	{
		Object[] aa = a;
		a = new Object[2*aa.length];
		System.arraycopy(aa, 0, a, 0, size);
	}
	
	public String toString()
	{
		String str = "bottom ";
		
		for(int i=0; i<size;i++)
		{
			str += a[i] + " ";
		}
		
		str += "top";
		
		return str;
	}
	
	public boolean equals(Object object)
	{
		if(a[size-1].equals(object))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public LinkedStack toLinkedStack()
	{
		Stack temp_stack = new LinkedStack();
		
		for(int i=a.length-1;i>=0;i--)
		{
			temp_stack.push(a[i]);
		}
		
		return (LinkedStack) temp_stack;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayStack toArrayStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object secondTop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void secondTopDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object GetBottom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object RemoveBottom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedStack reverse() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
