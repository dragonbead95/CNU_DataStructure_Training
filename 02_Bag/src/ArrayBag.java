import java.util.Arrays;

public class ArrayBag implements Bag{
	private Object[] objects = new Object[1000];
	private int size,i;
	
	public ArrayBag(Object object[])
	{
		objects = object;
	}
	
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		objects[size++]=object;
	}

	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				System.out.println(object + " 내용이 들어가 있습니다.");
				return true;
			}
				
		}
		return false;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		i = 0;
		return objects[i++];
	}

	@Override
	public Object getNext() {
		// TODO Auto-generated method stub
		return objects[i++];
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[size--] = null;
			}
		}
		
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean other_contains(Bag bag) {
		// TODO Auto-generated method stub
		int count=0;
		Object temp;
		
		
		
		for(int i=0;i<bag.size();i++)
		{
			if(bag.getFirst().equals(objects[i]))
			{
				count++;		
			}else{
				while(true)
				{
					temp = bag.getNext(); //여기가 문제
					if(temp!=null)
					{
						if(temp.equals(objects[i]))
						{
							count++;
							break;	
						}
					}else{
						break;
					}				
				}	
			}
		}

		if(count==bag.size())
		{
			return true;
		}else{
			return false;
		}
	}
	
}
