
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node(1);
		Node p = start;
		
		make(p);
		print(start);
		
		start = insert(start, 3);
		start = delete(start,3);
		print(start);
	}
	
	public static void make(Node p)
	{
		for(int i=1;i<5;i++)
		{
			p = p.next = new Node(i+1);
		}
	}
	
	public static void print(Node start)
	{
		for(Node p=start;p!=null;p=p.next)
		{
			System.out.print(p.data + " ");
		}
		System.out.println();
	}
	
	public static Node insert(Node start, int x)
	{
		if(start == null || start.data>x)
		{
			start = new Node(x,start);
			return start;
		}
		
		Node p = start;
		while(p.next != null)
		{
			if(p.next.data>x) break;
			p = p.next;
		}
		p.next = new Node(x,p.next);
		return start;
	}
	
	public static Node delete(Node start, int x)
	{
		if(start==null || start.data>x)
		{
			return start;
		}
		if(start.data == x)
		{
			return start.next;
		}
		
		for(Node p = start; p.next!=null; p=p.next)
		{
			if(p.next.data>x) break;
			if(p.next.data==x)
			{
				p.next = p.next.next;
				break;
			}
		}
		return start;
	}

}
