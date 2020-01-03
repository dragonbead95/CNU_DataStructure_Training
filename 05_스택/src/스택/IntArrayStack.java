package Ω∫≈√;

public class IntArrayStack implements IntStack {
	private int a[];
	private int size;
	
	public IntArrayStack(int capacity)
	{
		a = new int[capacity];
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if(size==0) throw new IllegalArgumentException();
		
		return a[size-1];
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(size==0) throw new IllegalArgumentException();
		
		int temp = a[--size];
		a[size] = 0;
		return temp;
	}

	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		if(size==a.length) resize();
		
		a[size++] = data;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void resize()
	{
		int[] aa = a;
		a = new int[aa.length*2];
		System.arraycopy(aa, 0, a, 0, size);
	}

}
