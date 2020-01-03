
public interface Bag {
	/**
	 * ���濡 ���빰 �߰�
	 * @param object
	 */
	public void add(Object object);
	
	/**
	 * ������ ���빰�� �ִ��� Ȯ��
	 * @param object
	 * @return boolean
	 */
	public boolean contains(Object object);

	/**
	 * ó�� ����ִ� ���빰 Ȯ�� 
	 * @return Object
	 */
	public Object getFirst();
	
	/**
	 * ���� ���빰 Ȯ��
	 * @return Object
	 */
	public Object getNext();
	
	/**
	 * �ش� ���빰 ����
	 * @param object
	 * @return boolean
	 */
	public boolean remove(Object object);
	
	/**
	 * ���� ũ�� Ȯ��
	 * @return int
	 */
	public int size();
	
	/**
	 * �־��� ���� �ٸ� �־��� �鿡 �ִ� ��� ��ü���� �����ϴ� ���� ���θ� �˷��ִ� �޼ҵ�
	 * @param bag
	 * @return boolean
	 */
	public boolean other_contains(Bag bag);
	
}
