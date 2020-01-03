
public class Node {
	private Object data;	// ������
	private Node next;		// ���� ���
	
	// ��� ������ ������ ����
	public Node(Object data)
	{
		this.data = data;
	}
	
	// �ش� ����� ������ ��ȯ
	public Object getData()
	{
		return data;
	}
	
	// �ش� ����� ���� ��带 ��ȯ
	public Node getNext()
	{
		return next;
	}
	
	// �ش� ����� ������ ����
	public void setData(Object data)
	{
		this.data = data;
	}
	
	// �ش� ����� ���� ��带 ����
	public void setNext(Node next)
	{
		this.next = next;
	}
}
