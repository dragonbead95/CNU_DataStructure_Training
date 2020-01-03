package 소수;

public class TestPrimeAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=0;n<=Integer.MAX_VALUE;n++)
			if(isPrime(n))
				System.out.println(n + " ");
	}

	public static boolean isPrime(int n)
	{
		if(n<2) return false;	// 1을 구분하기 위한 조건문
		if(n<4) return true;	// 2,3을 구분하기 위한 조건문
		if(n%2==0) return false;	// 4이상의 짝수를 구분하기 위한 조건문
		
		for(int d=3;d*d<=n;d+=2)
		{
			if(n%d==0) return false;
		}
		
		return true;
	}
}
