package leetcode;

import java.util.Arrays;

public class L283 {
	public static void main(String[] args) {
		int [] arr = {0,1,0,0,0,0,1,1,1,1,0,3,12};
		arr=ans(arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

	private static int[] ans(int[] arr) {
		// TODO Auto-generated method stub	
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			while(arr[j]!=0) {
				j++;
			}
			if(arr[i]!=0) {
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
		return arr;
	}

}
