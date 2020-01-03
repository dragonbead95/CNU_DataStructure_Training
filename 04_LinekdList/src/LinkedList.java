
public class LinkedList {
	private Node start;
	
	public void print()
	{
		for(Node p=start;p!=null;p=p.next)
		{
			System.out.print(p.data + " ");
		}
	}
	
	public Node insert(int x)
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
	
	public Node delete(int x)
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
