import java.util.Scanner;

public class BinaryTree {
	private int index;
	private int[] arrTree;
	
	public void run()
	{
		System.out.println("트리 원소를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] seperate = input.split(" ");
		sc.close();
		
		arrTree = new int[100];
		
		for(int i=1; i<=seperate.length; i++)
		{
			arrTree[i] = Integer.parseInt(seperate[i-1]);
		}
		
		for(int j=seperate.length+1; j<100;j++)
		{
			arrTree[j] = 0;
		}
		
		System.out.println("\n전위순회");
		index = 1;
		preorder(index);
		System.out.println();
		
		System.out.println("\n중위순회");
		index = 1;
		inorder(index);
		System.out.println();
		
		System.out.println("\n후위순회");
		index = 1;
		postorder(index);
		System.out.println();
	}
	
	public void preorder(int index)
	{
		if(arrTree[index] != 0)
		{
			System.out.print(arrTree[index] + " ");
			preorder(index*2);
			preorder(index*2+1);
		}
	}
	
	public void inorder(int index)
	{
		if(arrTree[index] != 0)
		{
			inorder(2 * index);
			System.out.print(arrTree[index] + " ");
			inorder(2 * index + 1);
		}
	}
	
	public void postorder(int index)
	{
		if(arrTree[index] != 0)
		{
			postorder(index*2);
			postorder(index*2+1);
			System.out.print(arrTree[index] + " ");
		}
	}
}
