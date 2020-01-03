
public class TestAVLTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree tree = new AVLTree(10);
		int num=10;
		for(int i=1;i<=5;i++)
		{
			tree.add(num);
			num += 10;
		}
		
		tree.preorderPrint();
		System.out.println();
		tree.inorderPrint();
		System.out.println();
		tree.postorderPrint();
		System.out.println();
		
		
	}

}
