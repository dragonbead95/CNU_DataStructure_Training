package 연결리스트기반_스택;

public class TestLinkedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new LinkedStack();
		Stack array_stack = new ArrayStack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.toString());
		stack = stack.reverse();
		System.out.println(stack.toString());
		
	}
}
