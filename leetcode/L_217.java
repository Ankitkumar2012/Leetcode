package leetcode;

import java.util.Arrays;

public class L_217 {
	public static void main(String[] args) {
		int [] arr= {1,2,3,1};
		System.out.println(ans(arr));
	}

	private static boolean ans(int[] arr) {
		Arrays.sort(arr);
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]==arr[j+1]) {
					return true;
				}
			}
		return false;
		
	}

}
