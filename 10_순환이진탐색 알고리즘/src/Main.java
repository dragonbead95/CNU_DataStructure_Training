
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("7 : " + binarySearch(arr,0,arr.length-1,7));
	}
	
	static int binarySearch(int[] arr,int p, int q,int x)
	{
		int i = (p+q)/2;
		if(p>q)
		{
			return -p-1;
		}else {
			if(arr[i] == x)
				return i;
			else{
				if(arr[i]>x) {
					q = i-1;
					binarySearch(arr,p,q,x);
				}
				else {
					p = i+1;
					binarySearch(arr,p,q,x);
				}
			}
		}
		return -1;
	}
}
