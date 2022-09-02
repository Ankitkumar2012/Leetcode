package leetcode;

public class L_492 {
	public static void main(String[] args) {
		int n=4;
		int arr[]=ans(n);
		for (int j = 0; j < arr.length; j++) {
			
			System.out.print(arr[j]+" ");
		}
	}

	private static int[] ans(int n) {
		int []arr=new int[2];
		int a=(int)Math.sqrt(n);
		while(n%a!=0) {
			a--;
		}
		int b=n/a;
		arr[0]=b;
		arr[1]=a;
		return arr;
	}
}
