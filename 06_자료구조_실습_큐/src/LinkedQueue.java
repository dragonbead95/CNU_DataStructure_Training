
public class LinkedQueue {
	private Node front;
	private Node rear;
	private int size;
	
	public LinkedQueue()
	{
		this.size=0;
		this.front=null;
		this.rear=null;
	}
	
	//큐가 비었는지 확인
	public boolean isEmpty()
	{
		return (front==null);
	}
	
	public void add(Object item)
	{
		Node node = new Node(item);
		node.setNext(null);
		
		if(isEmpty()) {
			rear = node;	//Node가 비었을 경우 rear와 front 모두 첫노드를 가리킨다.
			front = node;
		}else {
			rear.setNext(node);	// 존재할 경우 rear 노드 뒤에 추가하고 rear를 새로운 노드로 지정한다.
			rear = node;
		}
		
		size++;
	}
	
	public Object peek()	// 맨 앞에 있는 노드를 꺼내주는 작업
	{
		if(isEmpty()) throw new IllegalArgumentException("the queue is empty");
		else return front.getData();
	}
	
	// front를 큐에서 제거
	public Object remove()
	{
		Object item = peek();
		front = front.getNext();
		
		// 만약 데이터가 1개일때 프론트가 비었는데 rear가 데이터를 가리킬수 없으므로 front가 null이면
		// rear도 존재하는 데이터에서 null을 가리켜 준다.
		if(front==null)
		{
			rear = null;
		}
		
		return item;
	}
	
	public int size()
	{
		return size;
	}
	
	public Node getFront()
	{
		return this.front;
	}
	
	public Node getRear()
	{
		return this.rear;
	}
}
