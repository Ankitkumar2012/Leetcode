package leetcode;

import java.util.Arrays;

public class L_164 {
	public static void main(String[] args) {
		int [] arr= {3,6,9,1};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int v=Integer.MIN_VALUE;
		if(arr.length==1)return 0;
		for(int i=0; i<arr.length-1; i++) {
			int ans=arr[i+1]-arr[i];
			if(ans>v) {
				v=ans;
			}
		}
		return v;
	}

}
