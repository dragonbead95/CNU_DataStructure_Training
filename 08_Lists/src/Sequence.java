import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.ListIterator;

public class Sequence extends AbstractSequentialList{
	private Node head = new Node(null,null,null);
	private int size;
	
	public Sequence() {
		// TODO Auto-generated constructor stub
		head.prev = head.next = head;
	}
	
	public Sequence(Collection collection) {
		this();
		addAll(collection);
	}
	
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return new SequenceIterator(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private static class Node{
		Node prev, next;
		Object object;
		Node(Node p, Node n, Object o)
		{
			this.prev = p;
			this.next = n;
			this.object = o;
		}
	}
	
	private class SequenceIterator implements ListIterator{
		private Node last,next;
		private int nextIndex;
		
		public SequenceIterator(int i)
		{
			if(i<0 || i>size) throw new IndexOutOfBoundsException();
			nextIndex = i;
			next = head.next;
			for(int j=0;j<i;j++) {
				next = next.next;
			}
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextIndex<size;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(!hasNext()) throw new NoSuchElementException();
			last = next;
			next = next.next;
			++nextIndex;
			
			return last.object;
		}
		
		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return nextIndex>0;
		}

		@Override
		public Object previous() {
			// TODO Auto-generated method stub
			if(!hasPrevious()) throw new NoSuchElementException();
			next = last = next.prev;
			--nextIndex;
			return last.object;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return nextIndex;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return nextIndex-1;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			if(last==null) throw new IllegalStateException();
			last.prev.next = last.next;
			last.next.prev = last.prev;
			last = null;
			--size;
			--nextIndex;
		}

		@Override
		public void set(Object object) {
			// TODO Auto-generated method stub
			if(last==null) throw new IllegalStateException();
			last.object = object;
		}

		@Override
		public void add(Object object) {
			// TODO Auto-generated method stub
			Node newNode = new Node(next.prev,next,object);
			newNode.prev.next = next.prev = newNode;
			++size;
			++nextIndex;
			last = null;
		}
		
	}

}
