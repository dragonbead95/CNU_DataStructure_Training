package �Ҽ�;

public class TestPrimeAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=0;n<=Integer.MAX_VALUE;n++)
			if(isPrime(n))
				System.out.println(n + " ");
	}

	public static boolean isPrime(int n)
	{
		if(n<2) return false;	// 1�� �����ϱ� ���� ���ǹ�
		if(n<4) return true;	// 2,3�� �����ϱ� ���� ���ǹ�
		if(n%2==0) return false;	// 4�̻��� ¦���� �����ϱ� ���� ���ǹ�
		
		for(int d=3;d*d<=n;d+=2)
		{
			if(n%d==0) return false;
		}
		
		return true;
	}
}
