
public abstract class AbstractCollection implements Collection{
	protected AbstractCollection()
	{
		
	}
	
	public boolean add(Object object)
	{
		throw new UnsupportedOperationException();
	}
	
	public void clear()
	{
		for(Iterator it = iterator(); it.hasNext();) 
		{
			it.next();
			it.remove();
		}
	}
	
	public boolean contains(Object object)
	{
		Iterator it = iterator();
		if(object==null)
		{
			while(it.hasNext()) {
				if(it.next()==null)
					return true;
			}
		}else {
			while(it.hasNext()) {
				if(object.equals(it.next()))
					return true;
			}
		}
		
		return false;
	}
	
	public boolean isEmpty()
	{
		return (size()==0);
	}
	
	public abstract Iterator iterator();
	
	public boolean remove(Object object)
	{
		Iterator it = iterator();
		if(object==null)
		{
			while(it.hasNext()) {
				if(it.next()==null) {
					it.remove();
					return true;
				}
			}
		}else {
			while(it.hasNext()){
				if(object.equals(it.next())) {
					it.remove();
					return true;
				}
			}
		}
		
		return false;
	}
	
	public abstract int size();
	
	public String toString()
	{
		if(isEmpty())
			return "[]";
		
		Iterator it = iterator();
		StringBuffer buf = new StringBuffer("["+it.next());
		
		while(it.hasNext())
			buf.append(", " + it.next());
		
		return (buf+"]");
	}
}
