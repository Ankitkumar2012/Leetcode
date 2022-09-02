package leetcode;

public class L_704 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int t=7;
		System.out.println(ans(arr,t));
	}

	private static int ans(int[] arr,int t) {
		// TODO Auto-generated method stub
		int a=0;
		int b=arr.length-1;
		while(a<=b) {
			int k=a+(b-a)/2;
			if(arr[k]==t)return k;
			if(arr[k]>t)b=k-1;
			else a=k+1;
		}
		return -1;
	}

}
