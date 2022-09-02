package leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class L_628 {
	public static void main(String[] args) {
		int arr[] = { -100, -98, -1, 2, 3, 4 };
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int a=arr.length;
		int k=arr[0]*arr[1]*arr[a-1];
		int l=arr[a-1]*arr[a-2]*arr[a-3];
		return Math.max(k, l);
//		int ans = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				for (int j2 = j + 1; j2 < arr.length; j2++) {
//					int k = arr[i] * arr[j] * arr[j2];
//					ans = Math.max(ans, k);
//				}
//			}
//		}
//		System.out.println(ans);
	}

}
