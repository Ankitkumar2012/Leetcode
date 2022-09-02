package leetcode;

import java.util.Arrays;

public class L_268 {
	public static void main(String[] args) {
		int[] arr = {0};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int s=n*(n+1)/2;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		s=s-sum;
		return s;
		
		
//		Arrays.sort(arr);
//		int b=0;
//		if(arr[0]!=0)
//			return 0;
//		else if(arr.length==1 && arr[0]==1)
//			return 1;
//		else {
//		int a = arr[1] - arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] - arr[i - 1] >a || arr[i] - arr[i - 1]>1) {
//				return b=(arr[i]+arr[i - 1])/2;
//			}
//
//		}
//	}
//		return arr[arr.length-1]+1;
	}

}
