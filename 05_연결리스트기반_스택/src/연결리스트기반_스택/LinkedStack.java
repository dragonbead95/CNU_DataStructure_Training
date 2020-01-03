package 연결리스트기반_스택;

public class LinkedStack implements Stack {
	private Node top;
	private int size;
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(size==0) throw new IllegalArgumentException();
		return top.object;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		Object oldTop = top.object;
		top = top.next;
		size--;
		return oldTop;
	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub
		top = new Node(object,top);
		size++;		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private class Node{
		Object object;
		Node next;
		
		Node(Object object, Node next)
		{
			this.object = object;
			this.next = next;
		}
	}
	
	public String toString()
	{
		String str = "top ";
		
		for(Node p = top;p!=null;p=p.next)
		{
			str += p.object + " ";
		}
		
		str += "bottom";
		
		return str;
	}
	
	public boolean equals(Object object)
	{
		if(top.object.equals(object))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public Object[] toArray()
	{
		Stack temp_stack = new LinkedStack();
		Object[] a = new Object[size()];
		int i=0;
		
		for(Node p=top;p!=null;p=p.next)
		{
			temp_stack.push(this.pop());
		}
		
		for(i=0;i<a.length;i++)
		{
			a[i] = temp_stack.pop();
		}
		
		return a;
	}
	
	public ArrayStack toArrayStack()
	{
		Stack temp_stack = new LinkedStack();
		Stack stack = new ArrayStack(4);
		Object[] a;
		
		for(Node p=top;p!=null; p=p.next)
		{
			temp_stack.push(pop());
		}
		
		a = temp_stack.toArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			stack.push(a[i]);
		}
		
		return (ArrayStack) stack;
	}

	@Override
	public LinkedStack toLinkedStack() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object secondTop()
	{
		if(top.next!=null)
		{
			return top.next.object;
		}
		return null;
	}
	
	public void secondTopDelete()
	{
		if(top.next!=null)
		{
			top.next = top.next.next;
		}
	}
	
	public Object GetBottom()
	{
		for(Node p=top; p!=null; p=p.next)
		{
			if(p.next==null)
			{
				return p.object;
			}
		}
		
		return null;
	}
	public Object RemoveBottom()
	{
		for(Node p=top; p!=null; p=p.next)
		{
			if(p.next.next==null)
			{
				p.next = null;
			}
		}
		
		return null;
	}
	
	public LinkedStack reverse()
	{
		Stack temp_stack = new LinkedStack();
		Node p;
		
		for(p=top; p!=null ; p=p.next)
		{
			temp_stack.push(pop());
		}
		
		return (LinkedStack) temp_stack;
	}
	
	public LinkedStack SecondDeletefromTop()
	{
		return null;
	}
	
	
}
