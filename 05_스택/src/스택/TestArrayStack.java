package Ω∫≈√;

public class TestArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack crates = new ArrayStack(4);
		IntStack Int_Stack = new IntArrayStack(4);
		
		for(int i=1;i<=10;i++)
		{
			crates.push(i);
		}
		
		System.out.println(crates.equals(10));
		
	}

}
