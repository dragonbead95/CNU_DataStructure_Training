import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		for(int i=1;i<=10;i++)
		{
			l1.insert(i);
		}
		
		Node n1 = Node_insert(1,10);
		print(n1);
		shuffle(n1);
		print(n1);
		
		
	}
	
	public static Node Node_insert(int n, int k)
	{
		Node start = new Node(n);
		Node p = start;
		
		for(int i=n+1;i<=k;i++)
		{
			p = p.next = new Node(i);
		}
		
		return start;
	}
	
	public static void print(Node list)
	{
		for(Node p=list; p!=null; p=p.next)
		{
			System.out.print(p.data + " ");
		}
		System.out.println();
	}
	
	public static int size(Node list)
	{
		int count=0;
		
		for(Node p=list; p!=null; p=p.next)
		{
			count++;
		}
		
		return count;
	}
	
	public static int sum(Node list)
	{
		int sum=0;
		
		for(Node p=list; p!=null; p=p.next)
		{
			sum = sum + p.data;
		}
		return sum;
	}
	
	public static void deleteLast(Node list)
	{
		if(list.next.next==null)
		{
			throw new IllegalArgumentException();
		}
		
		for(Node p=list; p!=null; p=p.next)
		{
			if(p.next.next==null)
			{
				p.next = null;
			}
		}
	}
	
	public static Node copy(Node list)
	{
		Node new_Node = new Node(list.data,null);
		Node q = new_Node;
		
		for(Node p=list.next; p!=null; p=p.next)
		{
			q.next = new Node(p.data,q.next);
			q = q.next;
		}
		
		return new_Node;
	}
	
	public static Node sublist(Node list, int p, int q)
	{
		Node node_p = list;
		Node node_q = list;
		Node new_node;
		Node point;
		
		for(int i=0;i<p;i++)
		{
			node_p = node_p.next;
		}
		for(int i=0;i<q;i++)
		{
			node_q = node_q.next;
		}
		
		new_node = new Node(node_p.data,null);
		point = new_node;
		
		for(Node k = node_p.next ; k!=node_q ; k=k.next)
		{
			point.next = new Node(k.data,point.next);
			point = point.next;
		}
		
		return new_node;
	}
	
	public static void append(Node list1, Node list2)
	{
		Node p = list1;
		Node q = list2;
		
		while(p.next != null)
		{
			p = p.next;
		}
		
		while(q!=null)
		{
			p.next = new Node(q.data,p.next);
			p = p.next;
			q = q.next;
		}
		
	}
	
	public static Node concat(Node list1, Node list2)
	{
		Node new_node = new Node(list1.data,null);
		Node k = new_node;
		
		for(Node p = list1; p!=null ; p=p.next)
		{
			k.next = new Node(p.data,k.next);
			k=k.next;
		}
		for(Node q = list2; q!=null ; q=q.next)
		{
			k.next = new Node(q.data,k.next);
			k=k.next;
		}
		
		return new_node;
	}
	
	public static void replace(Node list, int i, int x)
	{
		Node p = list;
		
		for(int k=0;k<i;i++)
		{
			p = p.next;
		}
		
		p.data = x;
	}
	
	// 원소를 교환
	public static void swap(Node list, int i, int j)
	{
		Node p = list;
		Node q = list;
		int temp;
		
		for(int k=0;k<i;k++)
		{
			p = p.next;
		}
		for(int k=0;k<j;k++)
		{
			q = q.next;
		}
		
		temp = p.data;
		p.data = q.data;
		q.data = temp;
	}
	
	public static Node merged(Node list1, Node list2)
	{
		Node new_node;
		Node k;
		Node p = list1;
		Node q = list2;
		
		if(p.data>=q.data)
		{
			new_node = new Node(q.data,null);
			q = q.next;
		}else {
			new_node = new Node(p.data,null);
			p = p.next;
		}
		k = new_node;
		
		while(p!=null && q!=null)
		{
			if(p.data>=q.data)
			{
				k.next = new Node(q.data,k.next);
				k = k.next;
				q = q.next;
			}else {
				k.next = new Node(p.data,k.next);
				k = k.next;
				p = p.next;
			}
		}
		
		if(p==null)
		{
			while(q != null)
			{
				k.next = new Node(q.data,k.next);
				k = k.next;
				q = q.next;
			}
		}else if(q==null) {
			while(p != null)
			{
				k.next = new Node(p.data,k.next);
				k = k.next;
				p = p.next;
			}
		}
		
		return new_node;
		
	}
	
	public static void shuffle(Node list)
	{
		Random r1 = new Random();
		Node k = list;
		int temp;
		
		for(Node p = list ; p!=null; p=p.next)
		{
			for(int i=0 ; i < r1.nextInt(size(list)) ; i++)
			{
				k = k.next;
			}
			
			temp = p.data;
			p.data = k.data;
			k.data = temp;
			
			k = list;
		}
	}

}
