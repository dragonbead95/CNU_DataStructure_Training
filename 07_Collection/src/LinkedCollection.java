
public class LinkedCollection extends AbstractCollection{
	private static class Node{
		Object object;
		Node prev, next;
		
		Node()
		{
			next = this;
			prev = this;
		}
		
		Node(Object o, Node p, Node n)
		{
			this.object = o;
			this.prev = p;
			this.next = n;
		}
	
	}
	
	private int size;
	private Node head = new Node();	// 더미 노드 헤드
	
	public boolean add(Object object) {
		head.prev.next = new Node(object,head.prev,head);
		head.prev = head.prev.next;
		++size;
		return true;
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			private Node cursor = head.next;
			private boolean okToRemove = false;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cursor!=head;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				if(cursor==head) throw new RuntimeException();
				okToRemove = true;
				Object object = cursor.object;
				cursor = cursor.next;
				return object;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				if(!okToRemove) throw new IllegalStateException();
				cursor.prev = cursor.prev.prev;
				cursor.prev.next = cursor;
				--size;
				okToRemove = false;
			}
		};
	}

	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	
	
}
