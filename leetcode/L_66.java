package leetcode;

import java.util.Arrays;

public class L_66 {
	public static void main(String[] args) {
		int[] arr = { 9,9,9};
		System.out.println(Arrays.toString(ans(arr)));
	}

	public static int[] ans(int[] arr) {
		// TODO Auto-generated method stub
//		int[] result = new int[arr.length + 1];
//		int i = arr.length - 1;
//		arr[i] += 1;
//		int sum = 0;
//		int carry = 0;
//		while (i >= 0) {
//			sum = carry + arr[i];
//			result[i] = sum % 10;
//			carry = sum / 10;
//			i--;
//		}
//		if (carry != 0)
//
//		{
//			result[0] = 1;
//		}
//
//		System.out.println(Arrays.toString(result));
//
//		return result;

	          int [] result=new int [arr.length+1];
	        for(int a=arr.length-1; a>=0; a--) {
	        	if(arr[a]<9) {
	        		arr[a]+=1;
	        		return arr;
	        	}else {
	        	arr[a]=0;
	        	}
	        }
	        result[0]=1;
	        return result;
	}

}
