package ���Ḯ��Ʈ���_����;

public interface Stack {
	public Object peek();
	public Object pop();
	public void push(Object object);
	public int size();
	public Object[] toArray();
	public ArrayStack toArrayStack();
	public LinkedStack toLinkedStack();
	public Object secondTop();
	public void secondTopDelete();
	public Object GetBottom();
	public Object RemoveBottom();
	public LinkedStack reverse();
}
