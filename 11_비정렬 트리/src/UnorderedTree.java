
import java.util.Iterator;
import java.util.Set;

public class UnorderedTree {
	private Object root;
	private Set subtrees;
	private int size;
	
	public UnorderedTree()
	{
		
	}
	
	public UnorderedTree(Object root)
	{
		this(root);
		subtrees = new Set();
		size = 1;
	}
	
	public UnorderedTree(Object root, Set trees)
	{
		this(root);
		for(Iterator it = trees.iterator();it.hasNext();) {
			Object object = it.next();
			if(object instanceof UnorderedTree) {
				UnorderedTree tree = (UnorderedTree)object;
				subtrees.add(tree);
				size = size + tree.size;
			}
		}
	}
	
	public int size()
	{
		return size;
	}
}
