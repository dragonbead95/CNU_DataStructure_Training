
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
	
	//ť�� ������� Ȯ��
	public boolean isEmpty()
	{
		return (front==null);
	}
	
	public void add(Object item)
	{
		Node node = new Node(item);
		node.setNext(null);
		
		if(isEmpty()) {
			rear = node;	//Node�� ����� ��� rear�� front ��� ù��带 ����Ų��.
			front = node;
		}else {
			rear.setNext(node);	// ������ ��� rear ��� �ڿ� �߰��ϰ� rear�� ���ο� ���� �����Ѵ�.
			rear = node;
		}
		
		size++;
	}
	
	public Object peek()	// �� �տ� �ִ� ��带 �����ִ� �۾�
	{
		if(isEmpty()) throw new IllegalArgumentException("the queue is empty");
		else return front.getData();
	}
	
	// front�� ť���� ����
	public Object remove()
	{
		Object item = peek();
		front = front.getNext();
		
		// ���� �����Ͱ� 1���϶� ����Ʈ�� ����µ� rear�� �����͸� ����ų�� �����Ƿ� front�� null�̸�
		// rear�� �����ϴ� �����Ϳ��� null�� ������ �ش�.
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
