package leetcode;

import java.util.Arrays;

public class L_88 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,0,0};
		int brr[]= {2,5,6};
		int n=3;
		int m=3;
		ans(arr,brr,n,m);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void ans(int[] arr, int[] brr, int n, int m) {
		 for (int i = 0; i < m; i++) {
				arr[i+n]=brr[i];
			}
			Arrays.sort(arr); 
	}

}
